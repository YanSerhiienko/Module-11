package homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> task2(List<String> strings) {
        List<String> stringsInUpperCase = strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return stringsInUpperCase;
    }
}
