package com.company.lesson3;

import java.util.Scanner;

public class B2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x ");
        double x = scanner.nextDouble();
        System.out.println("Enter y ");
        double y = scanner.nextDouble();
        if ( y == 0) {
            System.out.println("Invalid value "); return;
        }

        System.out.println("Choose the function: 1)sh(x), 2) x*x, 3) e^x ");
        int switchValue = scanner.nextInt();
        double function, result;

        switch (switchValue) {
            case 1: {
                function = Math.sin(x); break;
            }
            case 2: {
                function = Math.pow(x, 2); break;
            }
            case 3: {
                function = Math.exp(x); break;
            }
            default: return;

        }
        if (x / y == 0) {
            result = Math.log10(function) + Math.pow(Math.abs(function), 0.25);
        }
        else if (x / y < 0) {
            result = Math.log10(Math.abs(function / y)) - Math.pow(y, 2);
        }
        else {
            result = Math.pow(Math.pow(function, 2) + y,3);
        }
        System.out.println("The result is: " + result);
    }
}
