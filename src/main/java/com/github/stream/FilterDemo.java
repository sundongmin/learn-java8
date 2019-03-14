package com.github.stream;

import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        list.stream().filter(e -> e.id > 1 && e.sal < 6000).forEach(System.out::println);
    }

}
