package com.fordtest;

import com.custom.annotations.MyGabyAnnotation;
import com.custom.annotations.MyGabyMethodAnnotation;

@MyGabyAnnotation(
        priority = MyGabyAnnotation.Priority.HIGH,
        createdBy = "GFC",
        tags = {"JAVA", "Annotations"}
)
public class AnnotationExample {

    @MyGabyMethodAnnotation
    String shouldAlwaysBeProcessed(){
        return "This should be processed";
    }

    @MyGabyMethodAnnotation
    void willThrowException(){
        throw new RuntimeException("Yes, it it an exception");
    }

    @MyGabyMethodAnnotation(enabled = false)
    void shouldNotBeProcessed(){
        throw new RuntimeException("This should never be processed");
    }

}
