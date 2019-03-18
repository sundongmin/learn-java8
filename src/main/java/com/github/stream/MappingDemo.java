package com.github.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MappingDemo {
    public static void main(String[] args) {
        List<Person> list = Person.getList();
        Map<Integer, String> result = list.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName, Collectors.joining(","))));
        result.forEach((k, v) -> System.out.println(k + ", " + v));
    }
}
