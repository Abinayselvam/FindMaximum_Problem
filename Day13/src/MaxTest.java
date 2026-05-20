import java.util.Arrays;

public class MaxTest<T extends Comparable<T>> {

    T[] values;

    // Constructor
    public MaxTest(T... values) {
        this.values = values;
    }

    // Instance method
    public T testMaximum() {
        return testMaximum(values);
    }

    // Generic static method
    public static <T extends Comparable<T>> T testMaximum(T... values) {

        if (values.length == 0) {
            throw new IllegalArgumentException("No values provided");
        }

        Arrays.sort(values);

        T max = values[values.length - 1];

        printMax(max);

        return max;
    }

    // Print method
    public static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }
}