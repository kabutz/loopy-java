package eu.javaspecialists.courses.loopy;

import java.util.List;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop3CountingMatches {
    public static void main(String... args) {
        /*
        count = 0
        for each element e
            if e matches
                count++
        */
        List<String> strings = List.of("elephant", "aggravate", "zombi", "java", "haberdasher", "baclava", "guava");
        // TODO: count how many Strings contain the letters "ava"
        int count = 0;
        for (String e : strings) {
            if (e.contains("ava")) {
                count++;
            }
        }
        System.out.println("count = " + count);
        // Output:
        // count = 4
    }
}
