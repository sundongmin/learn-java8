package com.github.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        String result = list.stream().collect(Collectors.joining(",", "(", ")"));
        System.out.println(result);
    }
}
