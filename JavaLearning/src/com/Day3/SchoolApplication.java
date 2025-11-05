package com.Day3;

// Base class
class Person {
    String name;
    String dateOfBirth;

    // Constructor
    Person(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

// Derived class from Person
class Teacher extends Person {
    double salary;
    String subject;

    Teacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth); // calling Person's constructor
        this.salary = salary;
        this.subject = subject;
    }

    void displayTeacherInfo() {
        displayPersonInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

// Derived class from Person
class Student extends Person {
    int studentId;

    Student(String name, String dateOfBirth, int studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Student ID: " + studentId);
    }
}

// Derived class from Student
class CollegeStudent extends Student {
    String collegeName;
    String yearOfStudy;

    CollegeStudent(String name, String dateOfBirth, int studentId, String collegeName, String yearOfStudy) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.yearOfStudy = yearOfStudy;
    }

    void displayCollegeStudentInfo() {
        displayStudentInfo();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year of Study: " + yearOfStudy);
    }
}

// Main class to test everything
public class SchoolApplication {
    public static void main(String[] args) {
        // Create Teacher object
        Teacher teacher = new Teacher("Mr. Ramesh", "10-05-1980", 45000, "Mathematics");
        System.out.println("----- Teacher Info -----");
        teacher.displayTeacherInfo();

        // Create Student object
        Student student = new Student(" Pragatha ", "02-05-2006", 101);
        System.out.println("\n----- Student Info -----");
        student.displayStudentInfo();

        // Create College Student object
        CollegeStudent collegeStudent = new CollegeStudent("Rakul", "20-01-2004", 201, "ABC College", "Second Year");
        System.out.println("\n----- College Student Info -----");
        collegeStudent.displayCollegeStudentInfo();
    }
}
