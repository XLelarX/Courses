# Требования к решению задач

## Git

| Требование | Помощь в реализации |
| ---------- | ------------------- |
| Конфигурационных файлов IDE не должно быть в изменениях в Git-е | Добавление файлов в файл _.gitignore_ |
| Названия веток и ПР-ов должны быть адекватными и передавать суть задания | Напишите что было реализовано в двух словах (не буквально) |
| Каждое задание реализуется в новой ветке и изменения из одних веток не должны попадать в другие | Новая ветка должна быть сделана из корневой ветки вашего удаленного репозитория |

### Паттерн взаимодействия с Git (TODO)

## Maven(TODO)

## Стиль кода

### Общие требования

| Требование | Помощь в реализации |
| ---------- | ------------------- |
| Стиль кода должен быть един для всех участков кода | Использование форматирования, встроенного в IDE | 
| Все названия должны иметь адекватные названия, отображающие суть и логику вашего кода | Использование переводчика. Сокращение названий путем исключения избыточной информации |
| Названия пакетов должны писаться в нижнем регистре |  |
| Тестирование производится через тесты, а не через main метод (если тема уже изучена) | | 
| Тело _if / while / for_ и т.д. должно быть явно выделено {}  | | 
| Названия не должны иметь чисел в названии | Пишите числа словами, а лучше придумайте о | 

### Классы

| Требование | Пример |
| ---------- | ------ |
| Названия должны начинатся с буквы в верхнем регистре в стиле _camelCase_ | RestController, MainApplicationService | 
| Каждый класс должен располагаться в своем файле | |

### Методы

| Требование | Пример | Примечание |
| ---------- | ------ | ---------- |
| Названия должны начинатся с буквы в нижнем регистре в стиле _camelCase_ | toString(), persistInfoInDatabase() |  
| Внутренние методы, которые не используются в других классах должны быть с модификатором private | ``` private String persistInfoInDatabase() ``` |  
| Методы в классах должны располагаться в файле исходя из их модификаторов доступа. Сначала public, затем protected, в конце private | ``` public void publicMethod(); protected void protectedMethod(); private void privateMethod(); ``` |  
| Между методами должнен быть отступ, отделяющий их друг от друга | |  
| Тестовые методы должны быть с модификатором public | | Если проставить другой модификатор, то классы, запускающие тесты, не увидят ваши методы |  

### Поля / Переменные

| Требование | Пример |
| ---------- | ------ |
| Названия должны начинатся с буквы в нижнем регистре в стиле _camelCase_ | pluginFullName, responseBody |  
| Неизменяемые переменные необходимо делать константами | ```private final static ERROR_LOG_MESSAGE = "Произошла ошибка во время выполнения"``` |  
| Поля, доступ к которым необходим извне, обязаны быть private, а обращение к ним должно происходить через Setter-ы и Getter-ы | ``` private String name; public String getName(); public void setName(String name); ```|  
| Каждая переменная должна быть обозначена с указанием своего типа и каждая в своей строке | ``` double max = 0, sum = 0; ``` -> ``` double max = 0; double sum = 0; ``` |  
| Создание экземпляра класса должна быть максимально близко к его использованию | ``` double max = 0; //code... double x = max + 1; ``` -> ``` double max = 0; double x = max + 1; ``` |  

### Spring

| Требование | Пример | Примечание |
| ---------- | ------ | ---------- |
| Названия бинов должны быть констант | ```@Component(KOKO_BEAN_NAME) @Bean(KOKO_BEAN_NAME) @Qualifier(KOKO_BEAN_NAME)``` |  
| Bean-ы, созданные через конфигурационный класс, не должны быть с модификатором private | | Если проставить private-модификатор, то Spring не увидит ваш bean и будет использовать уже существующий (если таковой имеется) |  
| Зависимости bean-ов не должны заполнятся посредством factory-методов | | Если так сделать, то в качестве зависимости у вас будет другой экземпляр вашего класса |  




Если встретилась проблема, которую вы не можете решить самостоятельно - пишите в личку в телеге.