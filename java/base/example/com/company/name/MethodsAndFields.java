package com.company.name;

/**
 * Класс с примерами использования методов и полей.
 */
public class MethodsAndFields {

    /**
     * Поле с модификатором доступа package-private.
     */
    int packagePrivateField;

    /**
     * Поле с модификатором доступа public.
     */
    public int publicField;

    /**
     * Поле с модификатором доступа private.
     */
    private int privateField;

    /**
     * Поле с модификатором доступа protected.
     */
    protected int protectedField;

    /**
     * Константы - поля с модификаторами final и static.
     */
    private final static boolean FINAL_STATIC_FIELD = true;

    /**
     * Поле с модификатором static, те не привязанный к экземпляру класса.
     */
    private static boolean staticField;

    /**
     * Поле с модификатором final, те неизменяемый.
     */
    private final boolean finalField = true;

    /**
     * Метод с возвращаемым значением.
     */
    long methodWithOneArg(int first) {
        return (long) first;
    }

    /**
     * Метод без возвращаемого значения.
     */
    void methodWithTwoArgs(int first, boolean second) {
    }

    /**
     * Метод с модификатором доступа package-private.
     */
    void methodWithPackagePrivateModifier() {
    }

    /**
     * Метод с модификатором доступа public.
     */
    public void methodWithPublicModifier() {
    }

    /**
     * Метод с модификатором доступа private.
     */
    private void methodWithPrivateModifier() {
    }

    /**
     * Метод с модификатором доступа protected.
     */
    protected void methodWithProtectedModifier() {
    }

    /**
     * Метод с модификатором static, те не привязанный к экземпляру класса.
     */
    private static boolean methodWithStaticModifier() {
        // Внутри статических ресурсов нельзя использовать нестатические ресурсы,
        // т.к. они привязаны к экземпляру класса, который еще не создан
        //
        //return privateField;
        //return methodWithPrivateModifier();

        // Внутри статических ресурсов можно использовать статические ресурсы
        return staticField;
    }

    /**
     * Поле с модификатором final, те неизменяемый
     */
    private void methodWithFinalField() {
        // Ресурсы с модификатором final нельзя изменять
        //
        //finalField = false;

        // Перед использованием переменная должна быть инициализированна
        //        final boolean finalVariable;
        //        boolean second = finalVariable;
    }

    /**
     * Использование методов.
     */
    private void utilisingMethods() {
        methodWithOneArg(1);
        int intValue = 10;

        //Создание экземпляра класса через базовый конструктор без аргументов
        MethodsAndFields classInstance = new MethodsAndFields();

        //Аргументы методов - константы

        //Вызов метода у экземпляра класса
        classInstance.methodWithOneArg(10);
        //Вызов метода у экземпляра класса с несколькими аргументами
        classInstance.methodWithTwoArgs(10, true);

        //Вызов метода у экземпляра класса с возвращаемым значением
        long methodResult = classInstance.methodWithOneArg(10);

        //Вызов метода у экземпляра класса без возвращаемого значения
        classInstance.methodWithTwoArgs(10, true);

        //Вызов метода у экземпляра класса с игнорированием возвращаемого значения
        classInstance.methodWithOneArg(10);

        //Аргументы методов - переменные

        int intVariable = 10;
        classInstance.methodWithOneArg(intVariable);

        boolean booleanVariable = true;
        classInstance.methodWithTwoArgs(intVariable, booleanVariable);
    }

    /**
     * Изменения аргументов метода сохраняются только в этом методе.
     */
    private static void modifiedArgsNotSaveValue(int arg) {
        arg += 10;
    }

    /**
     * Дубликаты методов.
     * <p>
     * Перегрузка метода - создание метода с тем же названием, но с другими аргументами.
     * Нельзя создавать методы с одинаковыми названиями, типами аргументов и их последовательностью.
     */
    private static void method(int firstArg) {
    }

    private static void method(String firstArg) {
    }

//    Нельзя создавать методы с одинаковыми названиями, типами аргументов и их последовательностью
//    private static String method(int arg) {
//        return "";
//    }

}
