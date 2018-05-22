package com.fordgraddlesample.springBoot.Sample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class JavaStreamSample {
    public static void main (String ar[]) throws IOException {

        //taking a list and converting into stream
//        List<String> names = Arrays.asList("Gaby", "Syed", "Baby", "Susan", "Joshua", "Jesus", "Nomean", "Flores", "German");
//        names
//                .stream()
//                .filter(x -> x.startsWith("J"))
//                .map(String :: toLowerCase)
//                .forEach(System.out::println);

        Stream<String> names = Files.lines(Paths.get("c://randomNames.txt"));
        names
                .sorted()
                .filter(x->x.length()<12)
                .forEach(System.out::println);
        names.close();


    }
}
