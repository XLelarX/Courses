package com.company.test;

import java.util.Scanner;

/**
 * Класс с практическими примерами.
 */
public class Tests {

    private final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(twentyOne());
    }

    private static String ifExpressionTest() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (isEvenNumber(input)) {
            return "Четное!";
        }

        return "Не четное!";
    }

    private static int ifElseExpressionTest() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (isEvenNumber(input)) {
            System.out.println("Четное!");
        } else {
            System.out.println("Не четное!");
        }

        return input;
    }

    private static void ifElseExpressionWithVarTest() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String result;

        if (input == 0) {
            result = "ноль";
        } else {
            result = "не ноль";
        }

        System.out.println("Результат: " + result);
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static String switchWithBreakTest() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String result;
        switch (input) {
            case 1:
                result = "один";
                break;
            case 2:
                result = "два";
                break;
            default:
                result = "ноль";
        }

        System.out.println(result);

        return result;
    }

    private static String switchWithReturnTest() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        switch (input) {
            case 1:
                return "один";
            case 2:
                return "два";
            default:
                return "ноль";
        }
    }

    private static int doWhileSumOfInputNumbersTest() {
        int count = 0;
        String whileExpression;

        do {
            System.out.print("Введите целое число:");
            count += SCANNER.nextInt();
            System.out.print("Закончить работу? :");
            whileExpression = SCANNER.next();
        } while (!whileExpression.equals("да"));

        return count;
    }

    private static void reverseInputNumbers() {
        final int limit = 10;
        int[] numbers = new int[limit];

        for (int index = 0; index < limit; index++) {
            System.out.print("Введите целое число:");
            numbers[index] = SCANNER.nextInt();
        }

        System.out.print("Введенные числа в обратном порядке: ");
        for (int index = limit - 1; index >= 0; index--) {
            System.out.print(numbers[index]);
        }
    }

    private static String twentyOne() {
        final int limit = 21;
        int count = 0;

        while (count < limit) {
            System.out.print("Введите целое число: ");
            count += SCANNER.nextInt();
        }

        if (count > limit) {
            return "Лимит превышен";
        }

        return "Лимит соблюден";
    }

}

