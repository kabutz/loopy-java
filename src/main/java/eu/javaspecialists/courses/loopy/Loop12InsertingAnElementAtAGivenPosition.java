package eu.javaspecialists.courses.loopy;

import java.util.Arrays;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop12InsertingAnElementAtAGivenPosition {
    public static void main(String... args) {
        /*
        if there is room for another element
            Increment number of elements
            for i from number of elements - 1 to position + 1
                element at i = element at i - 1
            element at position = new element
        */
        int[] values = {3, 1, 1, 5, 9, 2, 6, 5, 3, 5, -1, -1, -1, -1};
        int currentSize = 10;
        // TODO: Insert the number 4 at position 2
        int newElement = 4;
        int position = 2;
        if (currentSize < values.length) {
            currentSize++;
            for (int i = currentSize - 1; i > position; i--) {
                values[i] = values[i - 1];
            }
            values[position] = newElement;
        }
        System.out.println("values = " + Arrays.toString(values));
        // Output:
        // values = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, -1, -1, -1]
    }
}
