package eu.javaspecialists.courses.loopy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop7PositionOfMaximum {
    public static void main(String... args) {
        /*
        largestPosition = empty optional
        for each element e
            if largestPosition is empty or measure of element at i > measure of element at largestPosition
                largestPosition = optional of i
        */
        List<String> strings = List.of("elephant", "aggravate", "zombi", "java", "haberdasher", "baclava", "guava");
        // TODO: find the position of the longest String
        Optional<Integer> largestPosition = IntStream.range(0, strings.size())
                .boxed()
                .max(Comparator.comparingInt(i -> strings.get(i).length()));
        System.out.println("largestPosition = " + largestPosition);
        // Output:
        // largestPosition = Optional[4]
    }
}
