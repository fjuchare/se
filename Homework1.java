package ru.nesterenko.se;

/**
 * DZ1
 */

public class Homework1 {
    public static void main(String[] args) {
        final int a, b, c, d, e;
        final byte byt = 1;
        final short shor = 0;
        final long log = 123456;
        final double doble = 15.9;
        final boolean bool = true;
        final char name = 'A';
        int g, h, i;
        int num = 3;
        g = h = 5;
        i = g + h;
        final int x = 1;
        boolean bool1 = (x < 0);

        a = 10;
        b = 3;
        c = 4;
        d = 2;
        e = a * (b + (c / d));
        System.out.println("Task3: e = a * (b + (c / d)) = " + e);

        if (i <= 20 && i >= 10) {
            System.out.println("Task4: " + true);
        } else {
            System.out.println("Task4: " + false);
        }

        if (num < 0)
            System.out.println("Task5: num is negative");
        else
            System.out.println("Task5: num is positive");

        if (bool1) {
            return bool1(true);
        } else {
            return bool1(false);
        }

        System.out.println("Hello, " + name);
    }
}