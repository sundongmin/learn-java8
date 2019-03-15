package com.github.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MaxMinDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("G", "B", "F", "E");

        Optional<String> max = list.stream().max(Comparator.comparing(String::valueOf));
        max.ifPresent(System.out::println);

        Optional<String> min = list.stream().min(Comparator.comparing(String::valueOf));
        min.ifPresent(System.out::println);
    }
}
