package eu.javaspecialists.courses.loopy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop6Maximum {
    public static void main(String... args) {
        /*
        largest = empty optional
        for each element e
            if largest is empty or measure of e > measure of largest
                largest = optional of e
        */
        List<String> strings = List.of("elephant", "aggravate", "zombi", "java", "haberdasher", "baclava", "guava");
        // TODO: find the longest String
        Optional<String> largest = strings.stream()
                .max(Comparator.comparing(String::length));
        System.out.println("largest = " + largest);
        // Output:
        // largest = Optional[haberdasher]
    }
}
