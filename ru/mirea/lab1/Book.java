package ru.mirea.lab1;

public class Book {
    private String name;
    private String author;
    private String genre;
    private int yearOfPublication;

    public Book(String name, String author, String genre, int year) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        yearOfPublication = year;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        genre = "unknown genre";
        yearOfPublication = 2023;
    }

    public Book(String name) {
        this.name = name;
        author = "unknown author";
        genre = "unknown genre";
        yearOfPublication = 2023;
    }

    public Book() {
        name = "unknown name";
        author = "unknown author";
        genre = "unknown genre";
        yearOfPublication = 2023;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYearOfPublication(int year) {
        yearOfPublication = year;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return name + " " + author + ", " + genre + ", " + yearOfPublication;
    }
}
