package streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsClass {

    public static void main(String[] args) {
        Optional<Object> o = Optional.of(null);

        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.map(n -> n.toString()).collect(Collectors.toList()));

        Stream.of(2, 3, 0, 1, 3)
            .flatMapToInt(x -> IntStream.range(0, x))
            .forEach(System.out::println);

        Stream.of(2, 3, 0, 1, 3)
            .map(x -> IntStream.range(0, x))
            .forEach(System.out::print);


        List<String> list = new ArrayList<>();
        list.add("sdfsgd");
        list.add("sdfsgd");
        list.add("sdfsgd");
        list.add("sdfsgd");
        list.add("sdfsgd");
        list.add("sdfsgd");
        list.add("sdfsgd");
        list.add("sdfsgd");

        for (String s : list) {
            System.out.println(s);
        }
        Map<String, Integer> collect = Stream.of(1, 2, 3, 4, 5, 6).skip(3).collect(Collectors.toMap(key -> key + "-key", key -> key));

        collect.entrySet().forEach(System.out::println);

        System.out.println(Stream.of(1, 2, 3, 4, 5, 6).count());

        IntStream.of(2, 1, 6, 8, 5, 4).skip(3).sorted().forEach(x -> System.out.println(x));
        IntStream.of(2, 1, 6, 8, 5, 4).map(x -> x + 10).forEach(x -> System.out.println(x));

        Map<String, String> map = new HashMap<>();
        map.put("first-k", "first-val");
        map.put("second-k", "second-val");
        map.put("third-k", "third-val");
        map.put("forth-k", "forth-val");
    }
}
