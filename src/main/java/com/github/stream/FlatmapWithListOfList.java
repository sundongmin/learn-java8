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
}
