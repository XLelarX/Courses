package lambdas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class LambdaProgram {

    public static void execute(CustomFunctionalInterface worker) {
        worker.doSomething();
    }

    public static String execute(Supplier<String> worker) {
        return worker.get();
    }

    public static void execute(Consumer<String> worker) {
        worker.accept("");
    }

    public static void main(String[] args) {
        execute(() -> {
            String s = "res" + "ult";
            return s;
        });

        execute((s) -> {
            String s1 = s + " lambda";
            System.out.println(s1);
        });

        List<String> list = Arrays.asList("arg1", "arg2");
        list.forEach(str -> System.out.println(str));

        List<Integer> intList = Arrays.asList(1, 2);

        final Integer etx = 1;
        List<String> collect = intList.stream()
            .map(LambdaProgram::method)
            .collect(Collectors.toList());

        System.out.println(collect);

        new Thread(() -> System.out.println("result")).start();
    }

    private static String method(final Integer etx, Integer a) {
        Integer internal = etx + a;
        return internal.toString();
    }

    private static String method(Integer a) {
        return a.toString();
    }
}
