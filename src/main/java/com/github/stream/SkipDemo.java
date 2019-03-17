package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class SkipDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().skip(2).forEach(System.out::println);
    }
}
