package eu.javaspecialists.courses.loopy;

import java.util.List;
import java.util.Optional;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop4FindingTheFirstMatchAndPosition {
    public static void main(String... args) {
        /*
        found = false
        position = 0
        while not found and there are more elements
            e = next element
            if e matches
                found = true
                match = e
            else
                position++
        */
        List<String> strings = List.of("elephant", "aggravate", "zombi", "java", "haberdasher", "baclava", "guava");
        // TODO: find the first position of a String with the letters "ava"
        record Result(String match, int position) { }
        Optional<Result> result = Optional.empty();
        for (int i = 0; result.isEmpty() && i < strings.size(); i++) {
            String e = strings.get(i);
            if (e.contains("ava")) {
                result = Optional.of(new Result(e, i));
            }
        }
        System.out.println("result = " + result);
        // Output:
        // result = Optional[Result[match=aggravate, position=1]]
    }
}
