# Maven

## Структура maven-проекта

* В папке src/main/java содержатся java-классы
* В src/main/resources — ресурсы, которые использует наше приложение (HTML-страницы, конфигурационные файлы и т.д.)
* В src/test — содержатся тесты.
* В src/main/resources — ресурсы, которые используются тестами (JSON-файлы, конфигурационные файлы и т.д.)
* Файл pom.xml - главный файл для управления maven. Все описание проекта содержится здесь.

## Теги pom.xml

* groupId – идентификатор проекта
* artifactId – имя проекта (имя jar-файл)
* version – версия проекта
* dependencies > dependency – зависимости проекта
* parent – родительский модуль проекта
* modules > module – модули проекта
* properties – настройки проекта
* plugins > plugin – плагины проекта
* plugin.executions > execution – условия выполнения плагина
* execution.goals > goal – цель выполнения
* execution.phase – фаза выполнения
* profiles – профили проекта

## Maven goal и phase

* У каждой phase есть определенный список goal-ов, которые выполняются последовательно.
* Если при запуске maven-а указать определенную фазу, то он выполнит все фазы до нее, а потом ее саму, учитывая все goal-ы.
* Если при запуске maven-а указать определенный goal - выполнится только она, так что если до этого ничего не выполнялось, то высок риск ошибки.
* При явном указании цели в плагине – он будет привязан к дефолтной фазе. При указании фазы – он будет привязан к определенной фазе.

Примеры:
compiler:compile – compile goal из compiler плагина, связанного с фазой compile.
surefire:test - привязан к фазе test.

## Lifecycle-ы

* clean — удаляются все скомпилированные файлы из каталога target
* validate — идет проверка, вся ли информация доступна для сборки проекта
* compile — компилируются файлы с исходным кодом
* test — запускаются тесты
* package — упаковываются скомпилированные файлы
* verify — выполняются проверки для подтверждения готовности упакованного файла
* install — пакет помещается в локальный репозиторий. Теперь он может использоваться другими проектами как внешняя библиотека
* site — создается документация проекта
* deploy — собранный архив копируется в удаленный репозиторий

[полный список lifecycle-ов](https://maven.apache.org/ref/3.8.6/maven-core/lifecycles.html#default_Lifecycle)

## settings.xml tags

* localRepository - path to local repository
* offline - maven will only uise local repository as libs source 
* servers - contain information for connect to external servers
* mirrors - such as servers 
* proxies - contain proxy information
* profiles>profile:
	id - profile identifier
	repositories>repository:
		id - repo identifier 
		url - repo url
* activeProfiles>activeProfile - activate profile

## Password encryption
Master password requires to create following passwords.

1. mvn -emp password - encrypt master password 
2. Then generated password should be added in settings-security.xml in .m2 folder:
```
<settingsSecurity>
<master>encrypted_password</master>
</settingsSecurity>
```
3. mvn -ep password - encrypt proxy password
4. After that add it in settings.xml as user password

## Transitive dependencies

If one dependency utilized several times, then maven will download only one version of it, that closest to tree.
If same dependencies at the same depth, Maven will use the first found dependency.
If you want Maven to use the custom version of artifact, you need to explicitly add that version dependency to pom.xml file.

dependencies>dependency>exclusions>exclusion - exclude transitive dependency

## Scopes
- compile - available in the class path in all phases on a project build, test, and run. This is the default scope.
- provided - available in the class path during the build and test phases.
- runtime - available in the class path during runtime
- test - available in the class path during the test phase
- system - such as provided scope, but dependency used from specified location.
- import - applicable for .pom files. Allows you to include dependency management information from a remote .pom file.

## Properties
- ${settings.parameter_name} - pull out property value  from settings.xml
- ${env.parameter_name} - pull out property value from environment variable

## Archetype generator

mvn archetype:generate
 -D:
	archetypeGroupId - archetype group id
	archetypeArtifactId - archetype artifact id
	groupId - project group id
	artifactId - project artifact id
mvn archetype:create-from-project

* mvnw и mvnw.cmd – это сценарии-обертки Maven, эти сценарии можно использовать для создания нового проекта, даже если на вашем компьютере не установлен Maven;


## Misc

–Dmaven.test.skip=true - skip compiling and running tests
mvn -pl :<sub-project-name> <maven_operation> - run maven operation in sub-module
