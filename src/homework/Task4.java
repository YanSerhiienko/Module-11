package homework;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 <T> {
    //    Для цього почніть з x[0] = seed, і далі кожний наступний елемент рахуйте за формулою
//    на зразок x[n + 1] = 1 (a x[n] + c) % m для коректних значень a, c, та m.
//    Необхідно імплементувати метод, що приймає на вхід параметри a, c, та m, і повертає Stream<Long>.
//    Для тесту використовуйте такі дані:
//    a = 25214903917
//    c = 11
//    m = 2^48 (2в степені48`)

    private long a, c, m;
    //private int nextSeed;

    public Task4(long a, long c, long m) {     //int a, int c, int m
        this.a = a;
        this.c = c;
        this.m = m;
    }

    private Long getNext(T seed) {
        String stringToConvert = String.valueOf(seed);
        Long convertedLong = Long.parseLong(stringToConvert);
        
        return  (a * convertedLong + c) % m;

    }

    public Stream<Long> task4(long limit) {
        Task4 r = new Task4(a, c, m);
        Stream<Long> stream = Stream.iterate(0, seed -> r.getNext(seed));
        stream.limit(limit)
                .peek(System.out::println)
                .collect(Collectors.toList());
        return stream;
    }

    public static void main(String[] args) {
        Task4 t4 = new Task4(25214903917L, 11L, (long) Math.pow(2, 48));
        t4.task4(10);

    }
}
