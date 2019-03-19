package com.github.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FlatmapWithList {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book(10, "aaa"), new Book(20, "bbb"));
        Writer w1 = new Writer("Mohan", books);

        books = Arrays.asList(new Book(30, "xxx"), new Book(15, "zzz"));
        Writer w2 = new Writer("Sohan", books);

        List<Writer> writers = Arrays.asList(w1, w2);

        Optional<Book> bookOptional = writers.stream().flatMap(writer -> writer.getBooks().stream()).max(Comparator.comparingInt(Book::getPrice));
        bookOptional.ifPresent(book -> System.out.println(book.getName()));
    }
}
