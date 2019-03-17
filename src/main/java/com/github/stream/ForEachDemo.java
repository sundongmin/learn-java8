package com.github.stream;

import java.util.stream.Stream;

public class ForEachDemo {
    public static void main(String[] args) {
        Stream.of("aaa", "bbb", "ccc").forEach(System.out::println);
        Stream.of("bbb", "aaa", "ccc").forEachOrdered(System.out::println);
    }
}
