package com.epam.training.student_tatiana_shurysheva.main_task;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Представьтесь, пожалуйста: ");
        String name = scanner.nextLine();

        System.out.printf("Hello, %s! %n", name);
        scanner.close();
    }
}
