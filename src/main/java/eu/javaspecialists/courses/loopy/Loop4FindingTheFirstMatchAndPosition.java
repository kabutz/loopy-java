package eu.javaspecialists.courses.loopy;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

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
        Optional<Result> result = strings.stream()
                .filter(s -> s.contains("ava"))
                .findFirst()
                .map(s -> new Result(s, IntStream.range(0, strings.size())
                        .filter(i -> strings.get(i) == s)
                        .findFirst().getAsInt())
                );
        System.out.println("result = " + result);
        // Output:
        // result = Optional[Result[match=aggravate, position=1]]
    }
}
