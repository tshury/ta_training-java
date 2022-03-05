package com.epam.training.student_tatiana_shurysheva.main_task;

import java.util.Scanner;

public class RevertInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество агрументов: ");
        int numberOfElements = scanner.nextInt();

        Object[] arrayOfElements = new Object[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Введите аргумент: ");
            arrayOfElements[i] = scanner.next();
        }

        for (int i = numberOfElements - 1; i >= 0; i--) {
            System.out.printf("%s ", arrayOfElements[i]);
        }
        scanner.close();
    }
}
