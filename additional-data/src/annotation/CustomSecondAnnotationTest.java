package annotation;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

@CustomSecondAnnotation(name = "CustomSecondAnnotationTest")
public class CustomSecondAnnotationTest {

    @CustomClassAnnotation(name = "fieldAnnotation")
    private String field;

    @CustomSecondAnnotation(name = "init", num = 1)
    public String firstCommand() {
        return "firstCommand complete!";
    }

    @CustomSecondAnnotation(name = "list", num = 2)
    public String secondCommand() {
        return "secondCommand complete!";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void process(String command) {
        Arrays.stream(this.getClass().getDeclaredMethods()).forEach(
            method -> {
                if (method.isAnnotationPresent(CustomSecondAnnotation.class)) {
                    CustomSecondAnnotation annotation = method.getAnnotation(CustomSecondAnnotation.class);

                    if (annotation.name().equals(command)) {
                        try {
                            System.out.println(method.invoke(this));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        );
    }

    public void processField(String field) {
        Arrays.stream(this.getClass().getDeclaredFields()).forEach(
            innerField -> {
                if (innerField.isAnnotationPresent(CustomClassAnnotation.class)) {
                    CustomClassAnnotation annotation = innerField.getAnnotation(CustomClassAnnotation.class);

                    if (annotation.name().equals(field)) {
                        try {
                            System.out.println(innerField.get(this));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        );
    }
}
