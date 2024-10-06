package com.company.name;

import java.util.Random;

/**
 * Класс с примерами использования утилитных классов.
 */
public class UtilityClass {

    /**
     * Использование утилитного класса Math (Необходим для математических действий)
     */
    private void utilisingMathClass() {
        //Число Пи
        System.out.println(Math.PI);
        System.out.println(Math.E);

        //Возведение 2 в степень 6
        Math.pow(2, 6);

        //Корень из 4
        Math.sqrt(4);

        //Тригонометрические функции, просчитывающиеся из радиан
        Math.sin(Math.toRadians(30));
        Math.cos(Math.toRadians(45));
        Math.tan(Math.toRadians(60));

        //Логарифмы
        Math.log(1);
        Math.log10(10);

        //Экспонента
        Math.exp(10.5);

        //Округление числа
        Math.round(10.15);

        //Рандомное число от 0 до 1
        Math.random();

        //Целочисленное рандомное число от 0 до 100
        Math.round(Math.random() * 100);
    }

    /**
     * Утилитный класс для генерации рандомных значений
     */
    private void utilisingRandomClass() {
        Random random = new Random();

        float randomFloat = random.nextFloat();
        boolean randomBoolean = random.nextBoolean();
    }

}
