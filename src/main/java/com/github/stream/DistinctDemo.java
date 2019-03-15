package com.github.stream;

import java.util.Arrays;
import java.util.List;

public class DistinctDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "AA", "BB");
        long count = list.stream().distinct().count();
        System.out.println(count);

    }
}
