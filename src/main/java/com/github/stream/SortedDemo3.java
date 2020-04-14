package com.github.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo3 {

    public static void main(String[] args) {
        List<Book> list = Arrays.asList(new Book(1, 5), new Book(2, 1), new Book(3, 9), new Book(4, 6), new Book(3, 6));

        list.sort(Comparator.comparingInt(Book::getSkuid));

        list.forEach(System.out::println);

        System.out.println(">>>>>>>>>>>>>>>>>>>");
        list.sort(Comparator.comparing(Book::getId, Comparator.reverseOrder()));

        list.forEach(System.out::println);

    }

    static class Book {

        private int id;
        private int skuid;

        public Book(int id, int skuid) {
            this.id = id;
            this.skuid = skuid;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getSkuid() {
            return skuid;
        }

        public void setSkuid(int skuid) {
            this.skuid = skuid;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "id=" + id +
                    ", skuid=" + skuid +
                    '}';
        }
    }

}
