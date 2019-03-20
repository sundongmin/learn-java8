package com.github.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIfDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        list.removeIf(e -> e > 3);
        list.forEach(System.out::println);
    }
}
