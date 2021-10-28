package com.company.lesson2;

import java.util.Scanner;

public class B14Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s, x, y, z;
        System.out.println("Enter x: ");
        x = scanner.nextDouble();
        System.out.println("Enter y: ");
        y = scanner.nextDouble();
        System.out.println("Enter z: ");
        z = scanner.nextDouble();
        s = (Math.pow(y, (x + 1))) / (Math.pow(Math.abs(y - 2), 1/3.0) + 3) + ((x + y/2) /
                (2 * Math.abs(x + y))) * (Math.pow((x + 1), -1 / Math.sin(z)));
        System.out.println(s);


    }
}
