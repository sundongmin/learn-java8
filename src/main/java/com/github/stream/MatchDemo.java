package com.github.stream;

import java.util.ArrayList;
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

    static class Employee {

        public int id;
        public String name;
        public int sal;

        public Employee(int id, String name, int sal) {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }

        public static List<Employee> getEmpList() {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee(1, "A", 2000));
            list.add(new Employee(2, "B", 3000));
            list.add(new Employee(3, "C", 4000));
            list.add(new Employee(4, "D", 5000));
            return list;
        }
    }
}
