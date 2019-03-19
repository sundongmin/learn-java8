package com.github.stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfListDemo {
    public static void main(String[] args) {
        List<Line> list = new ArrayList<>();
        list.add(new Line(213));
        list.add(new Line(233));
        list.add(new Line(243));
        list.add(new Line(253));

        int sum = list.stream().mapToInt(Line::getLength).sum();
        System.out.println(sum);

        sum = list.stream().map(Line::getLength).collect(Collectors.summingInt(i -> i));
        System.out.println(sum);

        IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(Line::getLength));
        System.out.println(stats.getSum());

        sum = list.parallelStream().reduce(0, (output, ob) -> output + ob.getLength(), (a, b) -> a + b);
        System.out.println(sum);
    }
}
