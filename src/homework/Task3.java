package homework;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public void task3(String[] numbers) {
        StringBuilder allNumbers = new StringBuilder();
        for (String number : numbers) {
            allNumbers.append(number).append(" ");
        }
        String[] allNumbersArr = allNumbers.toString().replaceAll(",", " ").split("\\s+");

        String result = Arrays.stream(allNumbersArr)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
