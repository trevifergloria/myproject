package com.streamSample;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.nio.file.*;
import java.io.IOException;

public class JavaStreams {
    public static void main(String ar[]) throws IOException{
        //1 Integer Stream
//        IntStream.range(1,10).forEach(System.out::print);
//        System.out.println();

        //2 Integer Stream with skip
//        IntStream.range(1,10).skip(5).forEach(x ->System.out.println(x));
//        System.out.println();

        //3 Integer stream with sum
//        System.out.println(  IntStream.range(1,6).sum() );
//        System.out.println();

        //4 Stream of, sorted and find first
//        Stream.of("Ass","Anibal","Als").sorted().findFirst().ifPresent(System.out::print);

        //5 Stream from array, sort, filter and print
//        String[] names={"Gabriela", "Aleajndro","Syed", "Jesus","Sara", "Sergio","Jonas"};
//        Arrays.stream(names)  //Same as Stream.of (names)
//        .filter(x->x.startsWith("J"))
//        .sorted()
//        .forEach(System.out::println);

        //6 average of squares of an int array
//        Arrays.stream(new int[] {3,3,3}).map(x -> x*x).average().ifPresent(System.out::println);

        //





    }

}
