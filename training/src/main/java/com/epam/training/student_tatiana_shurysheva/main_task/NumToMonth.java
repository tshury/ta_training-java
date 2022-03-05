package com.epam.training.student_tatiana_shurysheva.main_task;

import java.util.Scanner;

public class NumToMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.print("Введите число от 1 до 12: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 12);

        System.out.printf("It's %s! %n", MONTHS.valueOfNumber(number));
        scanner.close();
    }

    enum MONTHS {
        JANUARY(1),
        FEBRUARY(2),
        MARCH(3),
        APRIL(4),
        MAY(5),
        JUNE(6),
        JULY(7),
        AUGUST(8),
        SEPTEMBER(9),
        OCTOBER(10),
        NOVEMBER(11),
        DECEMBER(12);

        final int number;

        private MONTHS(int number) {
            this.number = number;
        }

        public static MONTHS valueOfNumber(int number) {
            for (MONTHS e : values()
            ) {
                if (e.number == number) {
                    return e;
                }
            }
            return null;
        }
    }
}
