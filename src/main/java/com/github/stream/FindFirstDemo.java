package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirstDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("XX", "YY", "ZZ");
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
