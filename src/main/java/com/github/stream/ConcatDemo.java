package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatDemo {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A1", "A2", "A3");
        List<String> list2 = Arrays.asList("B1", "B2", "B3");

        Stream<String> concat = Stream.concat(list1.stream(), list2.stream());
        concat.forEach(System.out::println);
    }
}
