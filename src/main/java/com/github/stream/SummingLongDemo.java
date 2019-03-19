package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingLongDemo {
    public static void main(String[] args) {
        List<Long> list = Arrays.asList(340L, 240L, 360L);
        Long result = list.stream().collect(Collectors.summingLong(i -> i));
        System.out.println(result);
    }
}
