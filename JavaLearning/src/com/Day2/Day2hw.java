package com.Day2;

public class Day2hw {
    public static void main(String[] args){

        if (args.length == 2) {
            System.out.println(args[0] + " Technologies " + args[1]);
        } else {
            System.out.println("Please pass exactly two arguments!");
            System.out.println("Example: java Company ABC Mumbai");

        }
    }
}

