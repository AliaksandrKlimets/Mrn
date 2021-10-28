package com.company.lesson3;

import java.util.Scanner;

public class A8Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Enter a: ");
        a = scanner.nextInt();
        System.out.println("Enter b: ");
        b = scanner.nextInt();

        if (a > 0 && b > 0) {
            System.out.println("The result is 0 ");
        }
        else if (a < 0 && b < 0) {
            System.out.println(Math.abs(a) + Math.abs(b) );
        }
        else {
            System.out.println(a * b);
        }

    }
}
