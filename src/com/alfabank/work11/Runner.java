package com.alfabank.work11;

import java.util.Scanner;

public class Runner {




    public void run(){
        Book book1 = new Book();
        Book book2 = new Book("Horstmann", "Java");
        Book book3 = new Book("Avrora",1917, 500);
        Book [] books = createBooks();
        System.out.print("Enter number elements -> ");
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

        printBookByAuthor(new String("Horstmann"), books);
        printBookByPublisher(new String("Avrora"), books);
        printBookAfterYear(1914, books);
    }

    public void runMenu(){
        Book [] books = createBooks();

        initCost(books);
        int menuNumberExit = 4;

        while (true){
            int menuNumber = searchMenu(books);
            if (menuNumber == menuNumberExit){
                break;
            }
        }
    }

    private int searchMenu(Book [] books){
        System.out.println("\n Search menu:");
        System.out.println("1 - By author");
        System.out.println("2 - By publisher");
        System.out.println("3 - After year");
        System.out.println("4 - Exit");
        System.out.print("Enter number menu: ");

        int menuNumber = inputNumber();
        System.out.println();

        switch (menuNumber){
            case 1:
                System.out.print("Enter name author: ");
                String searchAuthor = readString();
                printBookByAuthor(searchAuthor, books);
                break;
            case 2:
                System.out.print("Enter name publisher: ");
                String searchPublisher = readString();
                printBookByPublisher(searchPublisher, books);
                break;
            case 3:
                System.out.print("Enter year: ");
                int searchYear = inputNumber();
                printBookAfterYear(searchYear, books);
                break;
        }

        return menuNumber;
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

    private String readString() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                return text;
            } else {
                scanner.next();
            }
            System.out.println("Error enter text. Repeat!!!");
        }
    }

    private Book[] printBookByAuthor (String author, Book[] books){
        System.out.println("print book by author " + author);

        boolean notFound = true;
        for ( Book book : books){
            if (author.equals(book.getAuthor())){
                book.view();
                notFound = false;
            }
        }

        if(notFound){
            System.out.println("No matches found");
        }

        return books;
    }

    private Book[] printBookByPublisher (String publisher, Book[] books){
        System.out.println("print book by publisher " + publisher);

        boolean notFound = true;
        for ( Book book : books){
            if (publisher.equals(book.getPublisher())){
                book.view();
                notFound = false;
            }
        }

        if(notFound){
            System.out.println("No matches found");
        }

        return books;
    }

    private Book[] printBookAfterYear (int year, Book[] books){
        System.out.println("print book after year " + year);

        boolean notFound = true;
        for ( Book book : books){
            if (book.getYear() > year){
                book.view();
                notFound = false;
            }
        }

        if(notFound){
            System.out.println("No matches found");
        }

        return books;
    }
}
