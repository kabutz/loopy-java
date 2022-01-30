package eu.javaspecialists.courses.loopy;

import java.util.Arrays;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop10Filling {
    public static void main(String... args) {
        /*
        for i from 0 to number of elements - 1
           element at i = Compute value from i
        */
        int n = 13;
        // TODO: Create an int[] containing all the squares from 0 to < n
        int[] values = new int[n];
        for (int i = 0; i < values.length; i++) {
            values[i] = i * i;
        }
        System.out.println("values = " + Arrays.toString(values));
        // Output:
        // values = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144]
    }
}
