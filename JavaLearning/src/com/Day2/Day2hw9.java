package com.Day2;

public class Day2hw9 {
    public static void main(String[] args) {
        char ch = '9';
        if( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ) {
            System.out.println("Alphabet");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        else {
            System.out.println("Special Character");
        }
    }
}
