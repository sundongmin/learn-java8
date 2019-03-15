package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class SortedDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("DC", "CD", "AD");
        list.stream().sorted().forEach(System.out::println);
    }
}
