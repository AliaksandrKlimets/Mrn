package com.company.lesson2;

import java.util.Scanner;

public class Lesson2Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите количество фунтов");
//        double input = scanner.nextDouble();
//        System.out.println("Your result is: " + input/0.4536);

//        System.out.println("Введите количество кабельтов");
//        int input = scanner.nextInt();
//        if (isNegative(input)) {
//            System.out.println("Input is negative");
//            return;
//        } else {
//            System.out.println("Input is correct");
//        }
//        System.out.println("The result is: " + input * 219.5);

//        double s, x1, y1, z1;
//        System.out.println("Enter x1");
//        x1 = scanner.nextDouble();
//        System.out.println("Enter y1");
//        y1 = scanner.nextDouble();
//        System.out.println("Enter z1");
//        z1 = scanner.nextDouble();
//         s = calculate(x1,y1,z1);
//        System.out.println(s);
        int salary = 200000;
        double nalog = 0;
        if (salary > 1000000) {
            nalog = salary * 0.25;
        } else if (salary > 100000) {
            nalog = salary * 0.2;
        } else {
            nalog = salary * 0.15;
        }
        System.out.println(nalog);
    }

    static double calculateNalog(int salary) {
        double nalog = 0;
        if (salary > 1000000) {
            nalog = salary * 0.25;
        } else if (salary > 100000) {
            nalog = salary * 0.2;
        } else {
            nalog = salary * 0.15;
        }
        return nalog;
    }

    static boolean isNegative(int a) {
        return a < 0;
    }

}
