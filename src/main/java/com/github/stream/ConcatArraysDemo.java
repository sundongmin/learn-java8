package com.github.stream;

import java.util.stream.Stream;

public class ConcatArraysDemo {
    public static void main(String[] args) {
        Book[] bk1 = new Book[3];
        Book[] bk2 = new Book[3];
        {
            bk1[0] = new Book("Core Java", 200);
            bk1[1] = new Book("Spring MVC", 300);
            bk1[2] = new Book("Learning Freemarker", 150);
            bk2[0] = new Book("Core Java", 200);
            bk2[1] = new Book("Spring MVC", 300);
            bk2[2] = new Book("Learning Hibernate", 400);
        }
        Book[] bks = Stream.concat(Stream.of(bk1), Stream.of(bk2)).toArray(Book[]::new);
        for (Book b : bks) {
            System.out.println(b.getName() + ", " + b.getPrice());
        }

        //Remove duplicates using distinct()
        System.out.println("--Remove duplicates using distinct()--");
        bks = Stream.concat(Stream.of(bk1), Stream.of(bk2)).distinct().toArray(Book[]::new);
        for (Book b : bks) {
            System.out.println(b.getName() + ", " + b.getPrice());
        }
    }

    static class Book {
        private String name;
        private int price;

        public Book(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == null) {
                return false;
            }
            final Book book = (Book) obj;
            if (this == book) {
                return true;
            } else {
                return (this.name.equals(book.name) && this.price == book.price);
            }
        }

        @Override
        public int hashCode() {
            int hashno = 7;
            hashno = 13 * hashno + (name == null ? 0 : name.hashCode());
            return hashno;
        }
    }
}
