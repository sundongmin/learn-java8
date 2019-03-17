package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 11, 12);
        list.stream().peek(System.out::println).collect(Collectors.toList());
    }
}
