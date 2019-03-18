package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SummingIntDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30, 10, 20, 35);
        Integer result = list.stream().collect(Collectors.summingInt(i -> i));
        System.out.println(result);
    }
}
