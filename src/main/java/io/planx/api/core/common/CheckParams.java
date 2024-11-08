package io.planx.api.core.common;

import io.planx.api.core.annotation.Max;
import io.planx.api.core.annotation.Min;
import io.planx.api.core.annotation.NotBlank;
import io.planx.api.core.annotation.NotNull;
import io.planx.api.core.exception.PlanXException;
import io.planx.api.core.util.ErrorUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class CheckParams {

    public static void checkObjectNotNull(Object obj) {
        if (obj == null) {
            throw ErrorUtil.createParamsPlanxException("Parameter is required");
        }
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                try {
                    field.setAccessible(true);
                    Object value = field.get(obj);
                    if (annotation instanceof NotBlank) {
                        check(value, (NotBlank) annotation, field);
                    }
                    if (annotation instanceof NotNull) {
                        check(value, (NotNull) annotation, field);
                    }
                    if (annotation instanceof Min) {
                        check(value, (Min) annotation, field);
                    }
                    if (annotation instanceof Max) {
                        check(value, (Max) annotation, field);
                    }
                } catch (IllegalAccessException e) {
                    throw new PlanXException(e);
                }
            }
        }
    }

    private static void check(Object value, NotBlank annotation, Field field) {
        if (value == null || value.toString().isEmpty()) {
            throw ErrorUtil.createParamsPlanxException(annotation.message().replace("{name}", field.getName()));
        }
        String[] equals = annotation.eqs();
        if (equals.length > 0) {
            for (String s : equals) {
                if (!s.equals(value.toString())) {
                    throw ErrorUtil.createParamsPlanxException("Parameter " + field.getName() + " must be equal to " + s);
                }
            }
        }
    }

    private static void check(Object value, NotNull annotation, Field field) {
        if (value == null) {
            throw ErrorUtil.createParamsPlanxException(annotation.message().replace("{name}", field.getName()));
        }
    }

    private static void check(Object value, Min annotation, Field field) {
        if (value != null) {
            if (annotation.eq()) {
                if (new BigDecimal(value.toString()).compareTo(new BigDecimal(annotation.value())) < 0) {
                    throw ErrorUtil.createParamsPlanxException(annotation.message()
                            .replace("{name}", field.getName()).replace("{val}", annotation.value() + ""));
                }
            } else {
                if (new BigDecimal(value.toString()).compareTo(new BigDecimal(annotation.value())) <= 0) {
                    throw ErrorUtil.createParamsPlanxException(annotation.message()
                            .replace("{name}", field.getName()).replace("{val}", annotation.value() + ""));
                }
            }
        }
    }

    private static void check(Object value, Max annotation, Field field) {
        if (value != null) {
            if (annotation.eq()) {
                if (new BigDecimal(value.toString()).compareTo(new BigDecimal(annotation.value())) > 0) {
                    throw ErrorUtil.createParamsPlanxException(annotation.message()
                            .replace("{name}", field.getName()).replace("{val}", annotation.value() + ""));
                }
            } else {
                if (new BigDecimal(value.toString()).compareTo(new BigDecimal(annotation.value())) >= 0) {
                    throw ErrorUtil.createParamsPlanxException(annotation.message()
                            .replace("{name}", field.getName()).replace("{val}", annotation.value() + ""));
                }
            }
        }
    }
}
