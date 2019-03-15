package com.github.stream;

import java.util.List;

public class MatchDemo {

    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        boolean a = list.stream().allMatch(e -> e.id < 10 && e.name.startsWith("A"));
        boolean b = list.stream().anyMatch(e -> e.id < 10 && e.name.startsWith("A"));
        boolean c = list.stream().noneMatch(e -> e.id < 10 && e.name.startsWith("A"));

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
