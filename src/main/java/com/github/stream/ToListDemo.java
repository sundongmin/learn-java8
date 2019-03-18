package com.github.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListDemo {
    public static void main(String[] args) {
        List<String> list = Stream.of("aa", "bb", "cc").collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
