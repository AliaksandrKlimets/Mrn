package com.company.lesson3;

import java.util.Scanner;

public class B1Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();

        System.out.println("Choose the function: 1) sh(x), 2) x*x, 3) ex");
        int switchValue = scanner.nextInt();
        double functionResult, finalResult;

        switch (switchValue) {
            case 1: {
                functionResult = Math.sinh(x); break;
            }
            case 2: {
                functionResult = x*x; break;
            }
            case 3:  {
                functionResult = Math.exp(x); break;
            }
            default: {
                System.out.println("Error value"); return;
            }
        }
        if (x * y > 0) {
            finalResult = Math.pow(functionResult + y, 2) - Math.pow(Math.abs(functionResult), 1/3.0);
        } else if (x * y < 0) {
            finalResult = Math.pow(functionResult + y, 2) + Math.sin(x);
        } else {
            finalResult = Math.pow(functionResult + y, 2) + y * y * y;
        }
        System.out.println("Final result = " + finalResult);

    }
}
