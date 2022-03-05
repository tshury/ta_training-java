package com.epam.training.student_tatiana_shurysheva.main_task;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfArgs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int numberOfElements = scanner.nextInt();

        int[] arrayOfElements = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Введите число: ");
            arrayOfElements[i] = scanner.nextInt();
        }

        System.out.printf("Сумма чисел: %s %n", Arrays.stream(arrayOfElements).sum());
        int result = Arrays.stream(arrayOfElements).reduce(1, (a, b) -> a * b);
        System.out.printf("Произведение: %s %n", result);
        scanner.close();
    }
}
