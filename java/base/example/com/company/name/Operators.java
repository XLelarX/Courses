package com.company.name;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Operators {

    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Использование операторов с примитивами.
     */
    private void utilisingOperatorsWithPrimitives(
        byte byteValue,
        int value,
        long second,
        float floatValue,
        double doubleValue,
        char charValue,
        String stringValue,
        boolean boolValue
    ) {
//        innerValue = 10;
//        boolean b = false;
//
//        b = true || b;
//
//        int innerValue = -((((value + 1 * 10) - 1) / 10) % 10);
//        value - 1;
//        value / 10;
//        value % 10;
//        -10;
//
//        boolean boolVar = value == 10;
//        value< 10;
//        value > 10;
//        value >= 10;
//        value <= 10;
//        value <= 10;
//        !(value < 10);
//
//        'x' < 100;
//
//        true == false;
//        true != false;
//        false == firstMethod() && secondMethod();
//        true == (true || false);
//
//        1 & 10;
//        1 | 10;
//        ~110;
//
//        123 >> 1;
//        123 << 1;
//
//        1110111 ->0111011
//        1110111 < -1101110
//
//        true && true == true
//
//        false || false == false
//
//        1010101 & 1110111;
//
//        1010101
//
//        1010101 | 1110111;
//
//        1110111
//
//        int i = 10;
//        int k = 0;
//
//        k = i++;
//        k = 10;
//        i = 11;
//        k = i--;
//        k = 10;
//        i = 9;
//
//        k = ++i;
//        k = 11;
//        i = 11;
//        k = --i;
//        k = 9;
//        i = 9;
//
//        int source = 10;
//        int source2 = 11;
//        source += 11;
//        source -= source2;
//        source /= 11;
//        source %= 11;
//        source >>= 11;
    }

    /**
     * Цикл for для прохода по массиву.
     */
    private static void forCycle() {
        boolean[] arrayOfBoolean = {true, false, true};

        // Поле length используется для получения длины массива
        for (int index = 0; index < 10; index++) {
            System.out.println(arrayOfBoolean[index]);
        }

        int index = arrayOfBoolean.length - 1;
        for (; index >= 0; index--) {
            System.out.println(arrayOfBoolean[index]);
        }
    }

    /**
     * Цикл while для прохода по массиву.
     */
    private static void whileCycle() {
        boolean[] arrayOfBoolean = {false, false, true};

        // Аналог цикла for, написанный через while
        int index = arrayOfBoolean.length - 1;
        while (index >= 0) {
            System.out.println(arrayOfBoolean[index]);
            index--;
        }

        // Использование while
        List<Boolean> listOfBoolean = new ArrayList<Boolean>();
        listOfBoolean.add(false);
        listOfBoolean.add(false);
        listOfBoolean.add(true);

        Iterator<Boolean> iterator = listOfBoolean.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Использование do-while
        do {
            System.out.println(SCANNER.nextInt());
        } while (SCANNER.nextBoolean());

        // Использование foreach
        for (Boolean element : listOfBoolean) {
            System.out.println(element);
        }
    }

    /**
     * Использование break.
     * Прерывает выполнение цикла
     */
    private static void utilisingBreakInCycle() {
        int count = 0;
        while (true) {
            System.out.println(count++);
            if (SCANNER.nextBoolean()) {
                break;
            }
        }
    }

    /**
     * Использование continue.
     * Завершает текущую итерацию цикла и переходит на следущую
     */
    private static void utilisingContinueInCycle() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * Использование return.
     * Прерывает выполнение цикла посредством завершения выполнения метода
     */
    private static int utilisingReturnInCycle() {
        int count = 0;
        while (true) {
            count++;
            if (SCANNER.nextBoolean()) {
                return count;
            }
        }
    }

    /**
     * Пример рекурсии для подсчета суммы чисел.
     */
    private static int recursion(int sum, boolean isOver) {
        if (isOver) {
            return sum;
        }
        System.out.print("Введите целое число: ");
        sum += SCANNER.nextInt();
        System.out.print("Закончить работу? :");
        isOver = SCANNER.nextBoolean();
        return recursion(sum, isOver);
    }

    /**
     * Использование if-оператора.
     */
    private static void utilisingIfOperator() {
        //Оператор if с логическим выражением в качестве аргумента
        int varForExpression = 2;
        if (varForExpression == 3) {

        }

        //Оператор if с boolean переменной в качестве аргумента
        boolean booleanForExpression = true;
        if (booleanForExpression) {

        }

        //Оператор if с методом в качестве аргумента
        if (methodWithBooleanReturnValue()) {

        }

        //Оператор if-else
        if (methodWithBooleanReturnValue()) {

        } else {

        }
    }

    private static boolean methodWithBooleanReturnValue() {
        return true;
    }

    /**
     * Использование switch-оператора.
     * Работает с типами byte, short, int, char, enum
     */
    private static void utilisingSwitchOperator() {
        int variable = 10;
        switch (variable) {
            case 1:
                System.out.println("из первого блока case");
                break;
            case 2:
                System.out.println("из второго блока case");
                break;
            case 3:
            case 4:
                System.out.println("из четвертого блока case");
                break;
            case 5:
                System.out.println("из пятого блока case");
            case 6:
                System.out.println("из шестого блока case");
                break;
            default:
                System.out.println("из блока default");
        }

        switch (variable) {
            case 1:
                System.out.println("из первого блока case");
            case 2:
                System.out.println("из второго блока case");
            case 3:
            case 4:
                System.out.println("из четвертого блока case");
            case 5:
                System.out.println("из пятого блока case");
            case 6:
                System.out.println("из шестого блока case");
            default:
                System.out.println("из блока default");
        }

        switch (variable) {
            case 1: {
                variable *= 10;
                System.out.println("из первого блока case");
            }
            case 2: {
                variable *= 20;
                System.out.println("из второго блока case");
                break;
            }
            case 3:
            case 4:
                System.out.println("из четвертого блока case");
            case 5:
                System.out.println("из пятого блока case");
            case 6:
                System.out.println("из шестого блока case");
            default:
                System.out.println("из блока default");
        }
    }

}
