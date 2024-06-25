package annotation;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class CustomAnnotationUser {

    @CustomAnnotation(name = "firstCommand", num = 1)
    public String firstCommandMethod() {
        return "firstCommand complete!";
    }

    @CustomAnnotation(name = "secondCommand", num = 2)
    public String secondCommandMethod() {
        return "secondCommand complete!";
    }

    @CustomAnnotation(name = "thirdCommand", num = 3)
    public static String thirdCommandMethod() {
        return "thirdCommand complete!";
    }

    public void doCommand(String name) {
        Arrays.stream(this.getClass().getDeclaredMethods()).forEach(
            m -> {
                if (m.isAnnotationPresent(CustomAnnotation.class)) {
                    CustomAnnotation annotation = m.getAnnotation(CustomAnnotation.class);
                    System.out.println(annotation.name() + " " + annotation.num());
                    if (name.equals(annotation.name())) {
                        try {
                            System.out.println(m.invoke(this, null));
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
}
