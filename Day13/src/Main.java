import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Integer test
        testMaximum(10, 20, 30, 5);

        // Float test
        testMaximum(2.3f, 5.6f, 1.1f, 9.8f);

        // String test
        testMaximum("Apple", "Peach", "Banana", "Orange");
    }

    // Generic varargs method
    public static <T extends Comparable<T>> T testMaximum(T... values) {

        if (values.length == 0) {
            throw new IllegalArgumentException("No values provided");
        }




        Arrays.sort(values);

        T max = values[values.length - 1];

        printMax(max);

        return max;
    }

    // Generic print method
    public static <T> void printMax(T max) {
        System.out.println("Maximum value is: " + max);
    }
}