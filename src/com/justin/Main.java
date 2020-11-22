package com.justin;

import java.util.*;

public class Main {

    public static void main(String[] args){
        int age = 15; // for numbers
        System.out.println(age); // variable
        System.out.println("Hello world"); // string
        Scanner sc = new  Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("What is your no.");
        int b = sc.nextInt();
        System.out.print("Whats the second no.");
        int c = a + b;
        System.out.println(c);
    }
}