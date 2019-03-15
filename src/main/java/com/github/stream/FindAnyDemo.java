package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class FindAnyDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "BB", "CC");
        list.stream().findAny().ifPresent(System.out::println);
    }
}
