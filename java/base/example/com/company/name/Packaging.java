//Пакет с классами - вложенные папки, содержащие классы

package com.company.name;

//Импорт класса из другого пакета
import com.company.another.ClassThatNeedToImport;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//Импорт константы из другого пакета
import static com.company.another.ClassThatNeedToImport.CONSTANT_THAT_NEED_TO_IMPORT;

//Импорт static-метода из другого пакета
import static com.company.another.ClassThatNeedToImport.staticMethod;

//Импорт всех данных из другого пакета
import com.company.another.*;

//Импорт внутреннего класса из другого пакета
import com.company.another.ClassThatNeedToImport.InnerClassThatNeedToImport;

/**
 * Класс с примерами использования пакетов.
 */
public class Packaging {

    /**
     * Использование импортированного класса.
     */
    private ClassThatNeedToImport createClassThatNeedToImport() {
        return new ClassThatNeedToImport();
    }

    /**
     * Вызов статических ресурсов из других классов.
     */
    private static void callStaticResourcesFromOtherClass() {
        //Вызов статического метода при импорте класса
        ClassThatNeedToImport.staticMethod();
        //Вызов статического метода при импорте метода
        staticMethod();

        //Вызов статического поля при импорте поляыы
        System.out.println(CONSTANT_THAT_NEED_TO_IMPORT);
    }

}
