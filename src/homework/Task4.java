package homework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 <T> {
    private long a, c, m;

    public Task4(long a, long c, long m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }

    private Long getNext(long seed) {
        return  (a * seed + c) % m;
    }

    public Stream<Long> task4(long limit) {
        Task4 r = new Task4(a, c, m);
        Stream<Long> stream = Stream.iterate(0L, seed -> r.getNext(seed));
        List<Long> result = stream.limit(limit)
                .peek(System.out::println)
                .collect(Collectors.toList());
        return result.stream();
    }
}
