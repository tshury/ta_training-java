package com.epam.training.student_tatiana_shurysheva.main_task;

import java.util.Arrays;
import java.util.Scanner;

public class OutputArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество агрументов: ");
        int numberOfElements = scanner.nextInt();

        int[] arrayOfElements = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Введите аргумент: ");
            arrayOfElements[i] = scanner.nextInt();
        }

        System.out.print("Вывод без перевода строки: ");
        Arrays.stream(arrayOfElements).forEach(s -> System.out.printf("%s ", s));

        System.out.printf("%nВывод с переводом строки: %n");
        Arrays.stream(arrayOfElements).forEach(System.out::println);
        scanner.close();
    }
}
