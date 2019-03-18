package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxByMinByDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(30, 10, 20, 35);
        list.stream().collect(Collectors.maxBy((o1, o2) -> {
            if (o1 >= o2) {
                return 1;
            } else {
                return -1;
            }
        })).ifPresent(System.out::println);

        list.stream().collect(Collectors.minBy((o1, o2) -> {
            if (o1 >= o2) {
                return 1;
            } else {
                return -1;
            }
        })).ifPresent(System.out::println);
    }
}
