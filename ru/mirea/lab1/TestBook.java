package ru.mirea.lab1;

public class TestBook {
    public static void main(String[] args) {
        Book lotr = new Book("The Lord of the Rings", "J.R. Tolkien", "fantasy", 1954);
        System.out.println(lotr);

        Book voidBook = new Book();
        System.out.println(voidBook);

        voidBook.setName("Warhammer 40K");
        System.out.println(voidBook.getName());

        System.out.println(lotr.getAuthor());
    }
}
