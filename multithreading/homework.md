Задача 1:

Создать класс _Resource_ с полем типа _int_.

Задача 2:

Создать класс _ResourceProcessor_ с методами _increase_ и _decrease_ (Увеличивают и уменьшают значение поля класса _Resource_).

Задача 3:

Создать класс _Increaser_, наследник _Thread_, который будет использвать метод _increase_.

Задача 4:

Создать 3 экземпляров класса _Increaser_, и запустить их (каждый должен отработать по 6 раз).

Задача 5:

Сделать так, чтобы увеличение из задачи 4 выполнялась синхронно.

Задача 6:

Создать класс _Decreaser_, наследник _Runnable_, который будет использвать метод _decrease_.

Задача 7:

Создать экземпляр класса _Decreaser_, и убрать 5 экземпляров класса _Increaser_.
Используя _notify_ и _wait_ выполнить 100 итераций следующего:
1. Выполнять _increase_ пока поле класса _Resource_ не станет равно 5
2. Выполнять _decrease_ пока поле класса _Resource_ не станет меньше 1, но не больше 0