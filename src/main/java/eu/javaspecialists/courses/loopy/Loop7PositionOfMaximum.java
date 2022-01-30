package eu.javaspecialists.courses.loopy;

import java.util.List;

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
    }
}
