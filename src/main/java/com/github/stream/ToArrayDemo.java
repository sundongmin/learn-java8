package com.github.stream;

import java.util.stream.Stream;

public class ToArrayDemo {
    public static void main(String[] args) {
        Object[] objects = Stream.of("a", "b", "c", "d").toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
    }
}
