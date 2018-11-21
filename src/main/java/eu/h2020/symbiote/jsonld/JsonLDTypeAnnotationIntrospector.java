package eu.h2020.symbiote.jsonld;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VirtualAnnotatedMember;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import static eu.h2020.symbiote.jsonld.JsonLdProperties.CONTEXT;
import static eu.h2020.symbiote.jsonld.JsonLdProperties.TYPE;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.jena.graph.NodeFactory;

/**
 * subclass of {@link JacksonAnnotationIntrospector} that uses
 * {@link JsonLDType} annotation to produce JSON-LD upon serialization
 *
 * @author Michael Jacoby <michael.jacoby@iosb.fraunhofer.de>
 */
public class JsonLDTypeAnnotationIntrospector extends JacksonAnnotationIntrospector {

    public static final boolean DEFAULT_INCLUDE_TYPES_FROM_SUPERCLASSES = true;
    public static final boolean DEFAULT_ALWAY_USE_ARRAY_FOR_TYPE_PROPERTY = false;

    private boolean includeTypesFromSuperclasses = DEFAULT_INCLUDE_TYPES_FROM_SUPERCLASSES;
    private boolean alwaysUseArrayForTypeProperty = DEFAULT_ALWAY_USE_ARRAY_FOR_TYPE_PROPERTY;

    public JsonLDTypeAnnotationIntrospector() {
    }

    public JsonLDTypeAnnotationIntrospector(boolean includeTypesFromSuperclasses, boolean alwaysUseArray) {
        this.includeTypesFromSuperclasses = includeTypesFromSuperclasses;
        this.alwaysUseArrayForTypeProperty = alwaysUseArray;
    }

    private Set<String> findJsonLDTypeAnnotation(JavaType type) {
        Stream<Annotation> annotations = isIncludeTypesFromSuperclasses()
                ? ClassUtil.findSuperTypes(type, null, true).stream()
                        .flatMap(x -> Stream.of(ClassUtil.findClassAnnotations(x.getRawClass())))
                : Stream.of(ClassUtil.findClassAnnotations(type.getRawClass()));
        return annotations
                .filter(x -> Objects.equals(x.annotationType(), JsonLDType.class))
                .flatMap(x -> Stream.of(((JsonLDType) x).value()))
                .collect(Collectors.toSet());
    }

    @Override
    public void findAndAddVirtualProperties(MapperConfig<?> config, AnnotatedClass ac, List<BeanPropertyWriter> properties) {
        Set<String> types = findJsonLDTypeAnnotation(ac.getType());
        if (!types.isEmpty()) {
            PropertyName typePropertyName = _propertyName(TYPE, "");
            JavaType typeJavaType = (types.size() == 1 && !isAlwaysUseArrayForTypeProperty())
                    ? config.constructType(String.class)
                    : config.constructType(String[].class);
            Object typeValue = (types.size() == 1 && !isAlwaysUseArrayForTypeProperty())
                    ? types.iterator().next()
                    : types.toArray(new String[types.size()]);

            AnnotatedMember typeMember = new VirtualAnnotatedMember(ac, ac.getRawType(), TYPE, typeJavaType);

            SimpleBeanPropertyDefinition typePropDef = SimpleBeanPropertyDefinition.construct(config,
                    typeMember, typePropertyName, PropertyMetadata.STD_OPTIONAL, Include.USE_DEFAULTS);
            ValuePropertyWriter typeWriter = ValuePropertyWriter.construct(typeValue, typePropDef,
                    ac.getAnnotations(), typeJavaType);
            properties.add(typeWriter);
        }

        // context?
        JsonLDVocab vocabAnnotation = ac.getAnnotation(JsonLDVocab.class);
        String vocab = null;
        if (vocabAnnotation != null) {
            if (vocabAnnotation.value() != null && !vocabAnnotation.value().isEmpty()) {
                vocab = vocabAnnotation.value();
            } else if (!types.isEmpty()) {
                vocab = NodeFactory.createURI(types.iterator().next()).getNameSpace();
            }
        }
        Context context = null;
        if (vocab != null && !vocab.isEmpty()) {
            context = new Context(vocab);
        }
        for (BeanPropertyWriter property : properties) {
            JsonLDId propertyId = property.findAnnotation(JsonLDId.class);
            if (propertyId != null && propertyId.value() != null && !propertyId.value().isEmpty()) {
                if (context == null) {
                    context = new Context();
                }
                context.getProperties().put(property.getName(), propertyId.value());
            }
        }
        if (context != null) {
            PropertyName contextPropertyName = _propertyName(CONTEXT, "");
            JavaType contextType = config.constructType(Context.class);
            AnnotatedMember contextMember = new VirtualAnnotatedMember(ac, ac.getRawType(), CONTEXT, contextType);
            SimpleBeanPropertyDefinition contextPropDef = SimpleBeanPropertyDefinition.construct(config,
                    contextMember, contextPropertyName, PropertyMetadata.STD_OPTIONAL, Include.USE_DEFAULTS);
            ValuePropertyWriter contextWriter = ValuePropertyWriter.construct(context, contextPropDef,
                    ac.getAnnotations(), contextType);
            properties.add(contextWriter);
        }
    }

    public boolean isIncludeTypesFromSuperclasses() {
        return includeTypesFromSuperclasses;
    }

    public void setIncludeTypesFromSuperclasses(boolean includeTypesFromSuperclasses) {
        this.includeTypesFromSuperclasses = includeTypesFromSuperclasses;
    }

    public boolean isAlwaysUseArrayForTypeProperty() {
        return alwaysUseArrayForTypeProperty;
    }

    public void setAlwaysUseArrayForTypeProperty(boolean alwaysUseArrayForTypeProperty) {
        this.alwaysUseArrayForTypeProperty = alwaysUseArrayForTypeProperty;
    }

}
