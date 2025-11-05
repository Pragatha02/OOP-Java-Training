package com.Day3;



// Class representing Author details
class Author {
    private String name;
    private String email;
    private char gender;

    // Parameterized constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    // Setter for email (assuming only email can change)
    public void setEmail(String email) {
        this.email = email;
    }

    // Method to display Author info
    public String toString() {
        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
    }
}

// Class representing Book details
class Book {
    private String name;
    private Author author;   // Author object
    private double price;
    private int qtyInStock;

    // Parameterized constructor
    public Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyInStock() {
        return qtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    // Method to display Book info
    public String toString() {
        return "Book Name: " + name + "\n" +
                author.toString() + "\n" +
                "Price: " + price + "\n" +
                "Quantity in Stock: " + qtyInStock;
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("YASEEN ", "yaseen2305@gmail.com", 'M');

        // Create a Book object with that author
        Book book = new Book("Malgudi Days", author, 350.75, 50);

        // Print book and author details
        System.out.println("----- Book Details -----");
        System.out.println(book);
    }
}
