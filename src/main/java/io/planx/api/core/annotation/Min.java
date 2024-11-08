package io.planx.api.core.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Min {
    String message() default "The smallest value of parameter {name} is {val}";
    int value() default 0;
    boolean eq() default true;
}
