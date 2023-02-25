package homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Bob", "Rick", "Morty", "Alex", "Max");
        String[] numbers = {"1, 2, 0", "4, 5"};

        Task1 t1 = new Task1();
        System.out.println(t1.task1(names));

        Task2 t2 = new Task2();
        System.out.println(t2.task2(names));

        Task3 t3 = new Task3();
        t3.task3(numbers);
    }


}
