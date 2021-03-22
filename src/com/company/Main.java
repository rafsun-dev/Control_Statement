package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number = input.nextInt();

        if (number < 21) {
            System.out.println("Small");
        } else if (number > 21) {
            System.out.println("Big");
        } else {
            System.out.println("Equal");
        }
    }
}
