package com.company.name;

import com.company.another.ClassThatNeedToImport;

/**
 * Класс примерами использования классов, конструкторов и т.д.
 *
 * В каждом файле должен содержаться один public-класс.
 */
public class Classes {

    private final static String EMPTY_CONSTRUCTOR_MESSAGE = "Объект создан из конструктора без аргументов";
    private int innerValue = 1;

    /**
     * Явно созданный дефолтный конструктор.
     * Этот конструктор неявно создается, если нет других конструкторов.
     */
    public Classes() {
    }

    /**
     * Конструктор с аргументами.
     */
    public Classes(int innerValue) {
        this.innerValue = innerValue;
    }

    /**
     * Конструктор с аргументами, использующий другой конструктор.
     */
    public Classes(int innerValue, String messageWithCreation) {
        // Вызов другого конструктора из текущего
        // Вызов должен находиться в первой строке тела констуктора
        this(innerValue);
        System.out.println(messageWithCreation);
    }

    /**
     * Перегруженный конструктор (аналог перегруженного метода).
     */
    public Classes(
        String messageWithCreation,
        int innerValue
    ) {
        this.innerValue = innerValue;
        System.out.println(messageWithCreation);
    }

    /**
     * Использование экземпляра класса без создания переменной.
     */
    private long convertInDelegate(int source) {
        return new ClassThatNeedToImport().convertToLong2(source);
    }

    /**
     * Использование экземпляра класса после создания переменной.
     */
    private long convertInDelegateWithSout(int source) {
        ClassThatNeedToImport convertor = new ClassThatNeedToImport();
        System.out.println(convertor);
        return convertor.convertToLong2(source);
    }

    /**
     * Использование конструкторов.
     */
    private static void utilisingConstructors() {
        //Конструктор без аргументов
        Classes convertor = new Classes();

        //Конструкторы с аргументамиы
        Classes convertorWithArgument = new Classes(5);
        Classes convertorWithArgumentAndMessage = new Classes(
            5,
            "Объект был создан"
        );
    }

    /**
     * Метод Object-класса для сравнения двух экземпляров класса.
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Метод Object-класса для высчитывания hash-кода для класса.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Метод Object-класса для преобразования экземпляра класса в строку.
     */
    @Override
    public String toString() {
        return super.toString();
    }

}
