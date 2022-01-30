package eu.javaspecialists.courses.loopy;

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
        var result = new ArrayList<String>();
        for (String e : strings) {
            if (e.contains("ava")) {
                result.add(e);
            }
        }
        System.out.println("result = " + result);
        // Output:
        // result = [aggravate, java, baclava, guava]
    }
}
