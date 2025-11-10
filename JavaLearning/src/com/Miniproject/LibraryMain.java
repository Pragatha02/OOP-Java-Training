package com.Miniproject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Book {
    String bookId;
    String title;
    boolean isIssued;

    Book(String bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.isIssued = false;
    }
}

class Member {
    String memberId;
    String name;

    Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }
}

class InvalidReturnException extends Exception {
    public InvalidReturnException(String msg) {
        super(msg);
    }
}

class Library {
    HashMap<String, Book> books = new HashMap<>();
    HashMap<String, Member> members = new HashMap<>();

    Library() {
        // sample data
        books.put("B101", new Book("B101", "Java Programming"));
        books.put("B102", new Book("B102", "Data Structures"));
        members.put("M1", new Member("M1", "Pragatha"));
        members.put("M2", new Member("M2", "Jyotsana"));
    }

    void log(String message) throws IOException {
        FileWriter fw = new FileWriter("log.txt", true);
        fw.write(message + "\n");
        fw.close();
    }

    void addBook(String id, String title) throws IOException {
        books.put(id, new Book(id, title));
        log("Book Added: " + id + " - " + title);
    }

    void issueBook(String bookId) throws IOException {
        if (books.containsKey(bookId)) {
            Book b = books.get(bookId);
            if (!b.isIssued) {
                b.isIssued = true;
                log("Book Issued: " + bookId);
                System.out.println("Issued successfully.");
            } else {
                System.out.println("Already issued.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    void returnBook(String bookId) throws InvalidReturnException, IOException {
        if (!books.containsKey(bookId)) {
            throw new InvalidReturnException("Invalid Return — Book not in library!");
        }
        Book b = books.get(bookId);
        if (!b.isIssued) {
            throw new InvalidReturnException("Invalid Return — Book was not issued!");
        }
        b.isIssued = false;
        log("Book Returned: " + bookId);
        System.out.println("Returned successfully.");
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        while (true) {
            System.out.println("\n=== Library Management Menu ===");
            System.out.println("1. Add Book");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt(); sc.nextLine();

            try {
                switch (ch) {
                    case 1:
                        System.out.print("Book ID: ");
                        String id = sc.nextLine();
                        System.out.print("Title: ");
                        String title = sc.nextLine();
                        lib.addBook(id, title);
                        break;

                    case 2:
                        System.out.print("Enter Book ID: ");
                        lib.issueBook(sc.nextLine());
                        break;

                    case 3:
                        System.out.print("Enter Book ID: ");
                        lib.returnBook(sc.nextLine());
                        break;

                    case 4:
                        System.out.println("Thanks!");
                        return;

                    default:
                        System.out.println("Invalid.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
