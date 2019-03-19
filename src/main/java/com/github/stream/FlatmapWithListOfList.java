package com.github.stream;

import java.util.*;

public class FlatmapWithListOfList {
    public static void main(String[] args) {
        List<Book> list1 = Arrays.asList(new Book(10, "aaa"), new Book(20, "bbb"));

        List<Book> list2 = Arrays.asList(new Book(30, "xxx"), new Book(15, "zzz"));

        List<List<Book>> finalList = Arrays.asList(list1, list2);

        Optional<Book> min = finalList.stream().flatMap(Collection::stream).min(Comparator.comparing(Book::getPrice));
        min.ifPresent((System.out::println));
    }

    static class Book {
        private int price;
        private String name;

        public Book(int price, String name) {
            this.price = price;
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Writer {
        private String name;
        private List<Book> books;

        public Writer(String name, List<Book> books) {
            this.name = name;
            this.books = books;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Book> getBooks() {
            return books;
        }

        public void setBooks(List<Book> books) {
            this.books = books;
        }
    }
}
