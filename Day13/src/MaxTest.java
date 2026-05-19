import java.util.Arrays;

class MaxTest<T extends Comparable<T>> {

    // Generic method for any number of inputs
    public static <T extends Comparable<T>> T testMaximum(T... values) {

        if (values.length == 0) {
            throw new IllegalArgumentException("No values provided");
        }

        Arrays.sort(values); // sort ascending

        T max = values[values.length - 1];

        printMax(max);

        return max;
    }

    // Print method (UC5 requirement)
    public static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }
}