package com.company.name;

import java.util.Scanner;

/**
 * Класс с примерами использования классов для ввода-вывода.
 */
public class IO {

    /**
     * Дефолтный вывод данных в консоль
     */
    private static void defaultOutput() {
        System.out.println("logged text");
        System.out.print("logged text");
    }

    /**
     * Дефолтный ввод данных через консоль
     */
    private static void defaultInput() {
        Scanner scanner = new Scanner(System.in);

        //Обработка следующей введенной строки до разделителя WHITESPACE
        scanner.next();
        //Обработка следующей введенной до перехода на следующую строку
        scanner.nextLine();

        //Обработка следующего введенного числа типа long
        scanner.nextLong();
        //Обработка следующего введенного числа типа boolean
        scanner.nextBoolean();
    }

}
