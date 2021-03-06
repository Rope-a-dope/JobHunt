package com.laioffer.job.entity;

public class ExampleBook {
    public String title;
    public String author;
    public String date;
    public float price;
    public String currency;
    public int pages;
    public String series;
    String language;
    String isbn;

    public ExampleBook(String title, String author, String date, float price, String currency, int pages, String series, String language, String isbn) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.price = price;
        this.currency = currency;
        this.pages = pages;
        this.series = series;
        this.language = language;
        this.isbn = isbn;
    }
}
