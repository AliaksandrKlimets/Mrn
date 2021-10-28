package com.company.lesson3;

import java.util.Scanner;

public class B6Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x: ");
        double x = scanner.nextDouble();
        System.out.println("enter y; ");
        double y = scanner.nextDouble();
        if (y == 0) {
            System.out.println("invalid value");
            return;
        }
        System.out.println("Choose the function: 1) sh(x), 2) x*x, 3) ex");
        int switchValue = scanner.nextInt();
        double function, result;

        switch (switchValue) {
            case 1: {
                function = Math.sinh(x);
                break;
            }
            case 2: {
                function = Math.pow(x, 2);
                break;
            }
            case 3: {
                function = Math.exp(x);
                break;
            }
            default: return;
        }
        if (x / y == 0) {
            result = Math.exp(function - y) + Math.pow(x, 1/3.0);
        }
        else if (x / y > -5 && x / y < 0){
            result = Math.pow(x, 2) - Math.log10(Math.pow(y, 2) + x);
        }
        else {
            result = 2 * Math.pow(function, 2) - Math.pow(y, 3);
        }
        System.out.println("The result is: " + result);

    }

}
