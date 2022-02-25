package com.company;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        TreeSet<Book> treeBooks = new TreeSet<>();
        treeBooks.add(new Book("Преступление и наказание", "Достоевский"));
        treeBooks.add(new Book("Демон", "Лермонтов"));
        treeBooks.add(new Book("Колобок", "Народище"));
        treeBooks.add(new Book("Мастер и Маргарита", "Булгаков"));
        treeBooks.add(new Book("Тихий Дон", "Шолохов"));
        System.out.println(treeBooks);
        Iterator<Book> iterator = treeBooks.iterator();
        while (iterator.hasNext()){
            Book book = iterator.next();
            if (book.author == "Шолохов") System.out.println(book);
        }
    }
}
