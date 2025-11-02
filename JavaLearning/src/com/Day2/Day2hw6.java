package com.Day2;

public class Day2hw6 {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        if(num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
}
