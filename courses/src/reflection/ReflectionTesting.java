package reflection;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ReflectionTesting {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        CustomClass customClass = CustomClass.class
            .getDeclaredConstructor(String.class)
            .newInstance("empty");

        Class<? extends CustomClass> clazz = customClass.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
            field -> {
                field.setAccessible(true);
                try {
                    field.set(customClass, "privateField");
                    System.out.println(field.get(customClass));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        );

        System.out.println(clazz.getMethod("getPrivateField").invoke(customClass));

        Arrays.stream(clazz.getMethods()).forEach(System.out::println);

        Arrays.stream(clazz.getDeclaredConstructors()).forEach(
            constructor -> System.out.println(constructor.getExceptionTypes().length)
        );
    }
}

class CustomClass {
    private String privateField;

    public CustomClass(String privateField) throws NullPointerException {
        this.privateField = privateField;
    }

    public String getPrivateField() {
        return "privateField";
    }

    private void setPrivateField(String privateField) {
        this.privateField = privateField;
    }
}
