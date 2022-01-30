package eu.javaspecialists.courses.loopy;

import java.util.List;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop1Sum {
    public static void main(String... args) {
        /*
        sum = 0
        for each element e
            sum = sum + measure of e
        */
        List<String> strings = List.of("cheese", "tomato", "lettuce", "bread", "majo");
        // TODO: calculate the sum of the length of all the strings
        int sum = strings.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("sum = " + sum);
        // Output:
        // sum = 28
    }
}
