package com.github.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMapWithArray {
    public static void main(String[] args) {
        Integer[][] data = {{1, 2}, {3, 4}, {5, 6}};
        Stream<Integer> stream = Arrays.stream(data).flatMap(Arrays::stream).filter(num -> num % 2 == 0);
        stream.forEach(System.out::println);
    }
}
