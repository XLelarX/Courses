package com.company.name;

/**
 * Класс с примерами использования перечислений (enum-ов).
 */
public enum EnumClass {
    FIRST_VALUE("Первое значение"),
    SECOND_VALUE("Второе значение"),
    THIRD_VALUE("Третье значение"),
    FOURTH_VALUE("Четвертое значение");

    private String description;

    /**
     * Конструктор enum-а.
     */
    EnumClass(String description) {
        this.description = description;
    }

    /**
     * Использование enum-а.
     */
    private static void utilisingEnum(EnumClass arg) {
        switch (arg) {
            case FIRST_VALUE: {
                System.out.println("Первое значение ENUM-а");
                break;
            }
            case SECOND_VALUE: {
                System.out.println("Второе значение ENUM-а");
                break;
            }
            case THIRD_VALUE: {
                System.out.println("Третье значение ENUM-а");
                break;
            }
            // default блок для enum нужен на случай, если switch не доработан под новые значения enum
            default: {
                System.out.println("Значение ENUM-а не может быть обработано");
            }
        }
    }

}
