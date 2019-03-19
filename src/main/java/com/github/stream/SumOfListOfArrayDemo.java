package com.github.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListOfArrayDemo {
    public static void main(String[] args) {
        List<Integer[]> list = new ArrayList<>();
        Integer[] a1 = {6, 3, 8, 12};
        list.add(a1);

        Integer[] a2 = {8, 13, 9, 22};
        list.add(a2);

        int sum = list.stream().flatMap(Arrays::stream).collect(Collectors.summingInt(i -> i));
        System.out.println(sum);

        IntSummaryStatistics stats = list.stream().flatMap(Arrays::stream).collect(Collectors.summarizingInt(i -> i));
        System.out.println(stats.getSum());

        sum = list.stream().flatMap(Arrays::stream).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
