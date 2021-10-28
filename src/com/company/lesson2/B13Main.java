package com.company.lesson2;

import java.util.Scanner;

public class B13Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s, x, y, z;
        System.out.println("Enter x: ");
        x = scanner.nextDouble();
        System.out.println("Enter y: ");
        y = scanner.nextDouble();
        System.out.println("Enter z: ");
        z = scanner.nextDouble();
        s = Math.pow(y + Math.pow(x-1, 1/3.0), 0.25) / (Math.abs(x - y) * (Math.pow(Math.sin(z), 2) + Math.tan(z)));
        System.out.println(s);


    }
}
