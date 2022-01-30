package eu.javaspecialists.courses.loopy;

import java.util.OptionalDouble;
import java.util.Scanner;

// From https://horstmann.com/unblog/2022-01-25/
public class Loop2Average {
    public static void main(String... args) {
        /*
        sum = 0
        for each element e
            sum = sum + measure of e
        if number of elements > 0
            average = optional of sum / number of elements
        else
            average = empty optional
        */
        Scanner in = new Scanner("3 1 4 1 5 9 2 6 5 3 5");
        // TODO: calculate the average of all the numbers using in.hasNextInt()
        // TODO: and in.nextInt()
        int sum = 0;
        int count = 0;
        while (in.hasNextInt()) {
            int e = in.nextInt();
            sum = sum + e;
            count++;
        }
        OptionalDouble result = count > 0 ?
                OptionalDouble.of(sum * 1.0 / count) :
                OptionalDouble.empty();
        System.out.println("result = " + result);
        // Output:
        // result = OptionalDouble[4.0]
    }
}
