package com.alfabank.work11;

public class Runner {
    public void run(){
        Book book1 = new Book();
        Book book2 = new Book("Horstmann", "Java");
        Book book3 = new Book("Avrora",1917, 500);

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
    }
}
