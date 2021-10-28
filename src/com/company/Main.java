package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        // Целочисленные
//        byte a = 97;
//        short b = 5;
//        int c = 32000;
//        long d = 123123123;
//
//        // Дробные
//        float e = 23.4f;
//        double f = 345.6;
//
//        // Булевые
//        boolean g = false;
//
//        // Строковые
//        String h = "asd";
//
//        // Симпольные
//        char i = 'a';
//
//        // + - / * %
//        int result = a + b;
//        int result1 = a - b;
//        int result2 = a * b;
//        int result3 = a / b;
//        int result4 = a % b;
//        System.out.println("+ " + result);
//        System.out.println("- " + result1);
//        System.out.println("* " + result2);
//        System.out.println("/ " + result3);
//        System.out.println("% " + result4);

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a:");
//        byte a = scanner.nextByte();
//        System.out.println("Enter b:");
//        double b = scanner.nextDouble();
//        double result1 = a / b;
//        System.out.println("return: " + result1);

//        double s, x, y, z;
//        System.out.println("Enter x:");
//        x = scanner.nextDouble();
//        System.out.println("Enter y:");
//        y = scanner.nextDouble();
//        System.out.println("Enter z:");
//        z = scanner.nextDouble();
//
//        s = (2 * Math.cos(x - 2/3.0)) * (1 + z * z / (3 - z * z / 5)) / (0.5 + Math.pow(Math.sin(y), 2));
//        System.out.println("Result is: " + s);

//        int a = -10, b = -20, c = 30, sum = 0;
//        a(a);
//        a(b);
//        a(c);

        String res = scanner.next();

        switch (res) {
            case "y" : {
                System.out.println("Agreed"); break;
            }
            case "n": {
                System.out.println("disagreed"); break;
            }
            default: {
                System.out.println("Lox");
            }
        }
    }

    static void a (int a) {
//        if (a < 0) {
//            System.out.println(Math.pow(a, 2));
//        }
        if (a % 3 == 0) {
            System.out.println(a);
        }
    }

}
