package com.github.stream;

import java.util.stream.Stream;

public class StreamOfDemo {
    public static void main(String[] args) {
        Stream.of("Ram", "Shyam", "Mohan").forEach(System.out::println);
    }
}
