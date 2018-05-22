package com.custom.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) //Type meaning we can use at the class level
public @interface MyGabyAnnotation {
     enum Priority{
        LOW, MEDIUM, HIGH;
    }

    Priority priority() default Priority.MEDIUM;
    String[] tags() default  "";
    String createdBy() default "Gabriela";
    String lastModified() default "5/9/2018";
}

