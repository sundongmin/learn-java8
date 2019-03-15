package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class LimitDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC", "DD", "EE");
        list.stream().limit(3).forEach(System.out::println);
    }
}
