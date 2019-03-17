package com.github.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("AAA", "BBB");
        List<String> list2 = Arrays.asList("CCC", "DDD");
        Stream.of(list2, list1).flatMap(Collection::stream).forEach(System.out::println);
    }
}
