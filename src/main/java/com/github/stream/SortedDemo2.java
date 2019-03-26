package com.github.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedDemo2 {
    public static void main(String[] args) {

        List<Book> list = Arrays.asList(null, new Book(null), new Book(3L), new Book(4L));

        list.sort(Comparator.nullsLast(Comparator.comparing(Book::getNum, Comparator.nullsFirst(Long::compareTo)).reversed()));

        list.sort(Comparator.comparing((Book book) -> book.getNum()).reversed());

        list.forEach(System.out::println);
    }

    static class Book {
        private Long num;

        public Book(Long num) {
            this.num = num;
        }

        public Long getNum() {
            return num;
        }

        public void setNum(Long num) {
            this.num = num;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "num=" + num +
                    '}';
        }
    }
}
