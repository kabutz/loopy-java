package eu.javaspecialists.courses.loopy;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;
import java.util.List;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop5FindingAllMatches {
    public static void main(String... args) {
        /*
        result = empty list
        for each element e
            if e matches
                add e to result
        */
        List<String> strings = List.of("elephant", "aggravate", "zombi", "java", "haberdasher", "baclava", "guava");
        // TODO: find all Strings with letters "ava" and add to a List
        List<String> matches = strings.stream()
                .filter(e -> e.contains("ava"))
                .toList();
        System.out.println("matches = " + matches);
        // Output:
        // matches = [aggravate, java, baclava, guava]
    }
}
