package com.github.stream;

import java.util.List;

public class MapDemo {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmpList();
        list.stream().map(e -> new Player(e.id, e.name)).forEach(System.out::println);
    }

    static class Player {
        int id;
        String name;

        Player(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
}
