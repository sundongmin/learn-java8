package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AveragingDoubleDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Double result = list.stream().collect(Collectors.averagingDouble(x -> x * 2));
        System.out.println(result);
    }
}
