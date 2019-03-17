package com.github.stream;

import java.util.stream.Stream;

public class GenerateDemo {
    public static void main(String[] args) {
        Item item = new Item("AA");
        Stream.generate(item::getName).forEach(System.out::println);
    }
}
