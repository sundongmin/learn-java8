package com.github.stream;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapDemo {
    public static void main(String[] args) {
        Map<String, String> result = Stream.of("aa", "bb", "cc").collect(Collectors.toMap(k -> k, v -> v + v));
        result.forEach((k, v) -> System.out.println(k + "," + v));
    }
}
