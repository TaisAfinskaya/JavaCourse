package com.alfabank.work11;

public class Book {
    private int id = idCounter++;
    private String author;
    private String title;
    private String publisher;
    private int year;
    private int page;
    private double cost;

    private static int idCounter = 0;

    public Book() {
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public Book(String publisher, int year, int page) {
        this.publisher = publisher;
        this.year = year;
        this.page = page;
    }

    public void increaseCostToPercent(int percent){
        cost = cost + cost * percent / 100;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void view() {
        Book book = this;
        System.out.println(book.getId() + " "
                + getAuthor() + " "
                + this.getTitle() + " "
                + book.getPublisher() + " "
                + year + " "
                + this.page + " "
                + book.getCost());
    }
}
