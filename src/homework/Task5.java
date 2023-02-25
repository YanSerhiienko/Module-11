package homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip (Stream<T> streamA, Stream<T> streamB) {
        List<T> listA = streamA.collect(Collectors.toList());
        List<T> listB = streamB.collect(Collectors.toList());
        List<T> result = new ArrayList<>();
        int size = Math.min(listA.size(), listB.size());
        for (int i = 0; i < size; i++) {
            result.add(listA.get(i));
            result.add(listB.get(i));
        }
        return result.stream();
    }
}
