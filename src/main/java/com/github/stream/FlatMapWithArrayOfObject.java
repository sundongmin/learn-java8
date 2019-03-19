package com.github.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FlatMapWithArrayOfObject {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book(10, "aaa"), new Book(20, "bbb"));
        Writer w1 = new Writer("Mohan", books);

        books = Arrays.asList(new Book(30, "ccc"), new Book(15, "ddd"));
        Writer w2 = new Writer("Sohan", books);

        books = Arrays.asList(new Book(45, "eee"), new Book(25, "fff"));
        Writer w3 = new Writer("Vikas", books);

        books = Arrays.asList(new Book(5, "ggg"), new Book(15, "hhh"));
        Writer w4 = new Writer("Ramesh", books);

        Writer[][] writers = {{w1, w2}, {w3, w4}};

        Optional<Book> max = Arrays.stream(writers)
                .flatMap(Arrays::stream)
                .flatMap(writer -> writer.getBooks().stream())
                .max(Comparator.comparing(Book::getPrice));

        max.ifPresent(System.out::println);
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
