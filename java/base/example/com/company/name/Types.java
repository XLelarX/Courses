package com.company.name;

public class Types {

    /**
     * Использование строк.
     */
    private void utilisingStringClass() {
        String stringCreatedByEmptyConstructor = new String();
        String stringCreatedByConstructorWithValue = new String("");
        String defaultEmptyString = "";
        String defaultStringWithValue = "value";

        //Конкатенация строк
        String concatStrings = defaultEmptyString + defaultStringWithValue;

        //Символы
        String symbolInUnicode = "\u1234";
        String nextLineSymbol = "\n";
        String tabSymbol = "\t";
    }

    /**
     * Использование массивов.
     */
    private static void utilisingArrays() {
        // Создание и заполнение одномерного массива [1, 2, 3, 4, 5]
        int[] arrayOfInts = new int[5];
        arrayOfInts[0] = 1;
        arrayOfInts[1] = 2;
        arrayOfInts[2] = 3;
        arrayOfInts[3] = 4;
        arrayOfInts[4] = 5;

        int[] secondArrayOfInts = new int[]{1, 2, 3, 4, 5};

        //Array index out of bounds - ошибка, связанная с выходом за границы массива
        arrayOfInts[5] = 6;
        System.out.println(arrayOfInts.length);

        Classes[] arrayOfsObjects = new Classes[5];
        arrayOfsObjects[1] = new Classes();

        Classes[] secondArrayOfObjects = new Classes[]{
            new Classes(), new Classes()
        };

        // Создание и заполнение двумерного массива [[1, 2], [2, 3], [3, 4], [4, 5], [5, 6]]
        int[][] binaryArrayOfInts = new int[5][2];
        binaryArrayOfInts[0][0] = 1;
        binaryArrayOfInts[0][1] = 2;
        binaryArrayOfInts[1][0] = 2;
        binaryArrayOfInts[1][1] = 3;
        binaryArrayOfInts[2][0] = 3;
        binaryArrayOfInts[2][1] = 4;
        //...
    }

}
