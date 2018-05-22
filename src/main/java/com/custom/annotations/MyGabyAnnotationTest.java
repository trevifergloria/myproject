package com.custom.annotations;

import com.fordtest.AnnotationExample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class MyGabyAnnotationTest
{
    public static void main(String args){
        System.out.println("Processing");
        int success=0;
        int failed =0;
        int total=0;
        int disabled=0;

        Class<AnnotationExample> obj = AnnotationExample.class;

        //Process @MyGabyAnnotation

        if(obj.isAnnotationPresent(MyGabyAnnotation.class)){
            Annotation annotation= obj.getAnnotation(MyGabyAnnotation.class);
            MyGabyAnnotation custom= (MyGabyAnnotation) annotation;

            System.out.printf("%n Priotity : %s", custom.priority());
            System.out.printf("%n Created By : %s", custom.createdBy());
            System.out.printf("%n Tags : ");

            int tagLenght = custom.tags().length;

            for (String tag : custom.tags()){
                if (tagLenght>1){
                    System.out.print(tag+", ");
                }else{
                    System.out.print(tag);
                }
                tagLenght--;
            }
            System.out.printf("%nLastModified : %s%s%n", custom.lastModified());
        }

        //Process @MyGabyMethodAnnotation

        for(Method method: obj.getDeclaredMethods()){

            //if method is annotated with @MyGabyMethodAnnotation
            if(method.isAnnotationPresent(MyGabyMethodAnnotation.class)){
                Annotation annotation=method.getAnnotation(MyGabyMethodAnnotation.class);
                MyGabyMethodAnnotation customMethod = (MyGabyMethodAnnotation) annotation;

                //if enabled = true (default)
                if(customMethod.enabled()){
                    String result = "N/A";

                    try{
                        result = (String) method.invoke(obj.newInstance());
                        System.out.printf("%s -  @MyGabyMethodAnn '%s'  -   processed  %n   - result:  %n",
                                ++total,
                                method.getName(),
                                result);
                        success++;
                    }catch(Throwable ex){
                        System.out.printf("%s -  @MyGabyMethodAnn '%s'  - did NOT  processed  %n   - result:  %n",
                                ++total,
                                method.getName(),
                                ex.getCause());
                        failed++;
                    }
                }else{
                    System.out.printf("%s -  @MyGabyMethodAnn '%s'  -   did NOT process%n",
                            ++total,
                            method.getName()
                            );
                    disabled++;
                }
            }
        }
        System.out.printf("%nResult : Total :  %d, Successful : %d, Disabled %d%n",
                total,
                success,
                failed,
                disabled
                );

    }

}
