package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class CountDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "AB", "CC");
        long count = list.stream().filter(e -> e.startsWith("A")).count();
        System.out.println(count);
    }
}
