package com.alfabank.work11;

import java.util.Scanner;

public class Runner {

    public void run(){
        Book book1 = new Book();
        Book book2 = new Book("Horstmann", "Java");
        Book book3 = new Book("Avrora",1917, 500);
        Book [] books = createBooks();
        int percent = inputNumber();

//        System.out.println(book1.getId() + " "
//        + book1.getAuthor() + " "
//        + book1.getTitle() + " "
//        + book1.getPublisher() + " "
//        + book1.getYear() + " "
//        + book1.getPage() + " "
//        + book1.getCost());

        book1.view();
        book1.setId(1);
        book1.setAuthor("Maslov");
        book1.setYear(2000);
        book1.setCost(150.5);
        book1.view();

        book2.view();

        book3.view();

        initCost(books);
        printBooks(books);

        increaseCost(books, percent);
        printBooks(books);
    }

    private Book [] createBooks(){
        Book [] books = new Book[7];

        books[0] = new Book();
        books[1] = new Book("Horstmann", "Java");
        books[2] = new Book("Ekkel", "Thinking in Java");
        books[3] = new Book("Artur", "Остров джаварезов");
        books[4] = new Book("Conan", "Джарвар");
        books[5] = new Book("Агата Кристи", "12 тестировщиков");
        books[6] = new Book("Avrora",1917, 500);

        return books;
    }

    private void printBooks(Book[] books){
        for ( Book book : books){
            book.view();
        }
    }

    private void initCost(Book[] books){
        for ( Book book : books){
            book.setCost(calculateCost(book));
        }
    }

    private double calculateCost(Book book) {
        return book.getId()*100;
    }

    private void increaseCost(Book[] books, int percent){
        for ( Book book : books){
            book.increaseCostToPercent(percent);
        }
    }

    private int inputNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number elements -> ");
        while (true) {
            if (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number > 0) return number;
            } else {
                sc.next();
            }
            System.out.println("Error enter number. Repeat!!!");
        }
    }
}
