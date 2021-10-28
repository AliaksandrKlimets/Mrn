package com.company.lesson3;

import java.util.Scanner;

public class Lesson3Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary in UAH");
        double salaryUAH = scanner.nextDouble();
        if (salaryUAH < 0) {
            System.out.println("Salary is invalid");
            return;
        }
        double salaryUSD = salaryUAH / 27.0;
        double incomeTax = 0;
//        if (salaryUSD >= 1000) {
//            incomeTax = salaryUSD * 0.2;
//        }
//        else {
//            incomeTax = salaryUSD * 0.1;
//        }
        incomeTax = salaryUSD >= 1000 ? salaryUSD * 0.2 : salaryUSD * 0.1;
        System.out.println(salaryUSD >= 1000 ? "20" : "10");
        System.out.println("Income tax is " + incomeTax);
    }

    static void print(String text) {
        System.out.println(text);
    }
}
