package eu.javaspecialists.courses.loopy;

import java.util.Arrays;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop11RemovingTheElementAtAGivenPosition {
    public static void main(String... args) {
        /*
        for i from position + 1 to number of elements - 1
            element at i - 1 = element at i
        Decrement number of elements
        */
        int[] values = {3, 1, 4, 1, 5, 7, 9, 2, 6, 5, 3, 5};
        int currentSize = 12;
        // TODO: Remove the number at position 5
        int position = 5;
        for (int i = position + 1; i < currentSize; i++) {
            values[i - 1] = values[i];
        }
        values[currentSize-1] = -1;
        currentSize--;
        System.out.println("values = " + Arrays.toString(values));
        // Output:
        // values = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, -1]
    }
}
