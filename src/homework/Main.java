package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Rick", "Morty", "Alex", "Max");
        String[] numbers = {"1, 2, 0", "4, 5"};
        Stream<String> streamA = Stream.of("a", "b", "c", "d", "e");
        Stream<String> streamB = Stream.of("1", "2", "3", "4");

        Task1 t1 = new Task1();
        System.out.println(t1.task1(names));

        Task2 t2 = new Task2();
        System.out.println(t2.task2(names));

        Task3 t3 = new Task3();
        t3.task3(numbers);

        Task4 t4 = new Task4(25214903917L, 11L, (long) Math.pow(2, 48));
        t4.task4(10);

        Task5 t5 = new Task5();
        Stream<String> result = t5.zip(streamA, streamB);
        result.peek(System.out::println).collect(Collectors.toList());
    }
}
