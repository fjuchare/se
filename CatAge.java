package ru.nesterenko.se;

import java.util.Scanner;

public class CatAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лет вашей кошке?");

        if (scanner.hasNextInt()) {
            double CatAge = scanner.nextInt();

            CatAge = (CatAge * 3.5);
            System.out.println("Это все равно что " + CatAge + " человеческих лет");
        } else {
            System.out.println("Извините, но я понимаю только числа. Введите возраст кошки цифрами)");
        }
    }
}