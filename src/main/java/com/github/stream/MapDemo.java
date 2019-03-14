package com.github.stream;

import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        list.stream().map(e -> new Player(e.id, e.name)).forEach(System.out::println);
    }
}
