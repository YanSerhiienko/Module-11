package homework;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public String task1(List<String> names) {
        AtomicInteger order = new AtomicInteger(1);

        return names.stream()
                .map(name -> order.getAndIncrement() + ". " + name)
                .filter(this::isNotEven)
                .collect(Collectors.joining(", "));
    }

    private boolean isNotEven(String name) {
        String[] nameParts = name.split(" ");
        return Integer.parseInt(nameParts[0].substring(0, nameParts[0].length() - 1)) % 2 != 0;
    }
}
