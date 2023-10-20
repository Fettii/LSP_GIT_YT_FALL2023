package org.howard.edu.lsp.midterm.problem1;

public class Driver {
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book3 = new Book("1984", "George Orwell", 1960);

        System.out.println("Book 1 equals Book 2: " + book1.equals(book2));
        System.out.println("Book 1 equals Book 3: " + book1.equals(book3));
        System.out.println("Display of book's title, author, and year: " + book1.toString());
    }
}
