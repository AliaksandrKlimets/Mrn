package com.company.lesson1;

import java.util.Scanner;

public class Lesson1Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber;
        firstNumber = scanner.nextInt();
        System.out.println("Enter second number;");
        double secondNumber = scanner.nextDouble();

        System.out.println("+ " + (firstNumber + secondNumber));
        System.out.println("- " + (firstNumber - secondNumber));
        System.out.println("* " + (firstNumber * secondNumber));
        System.out.println("/ " + (firstNumber / secondNumber));
    }
}
