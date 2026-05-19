public class MaxTest {
    public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {

        T max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args) {

        // Integer
        System.out.println(testMaximum(30, 20, 10));

        // Float
        System.out.println(testMaximum(3.5f, 6.7f, 1.2f));

        // String
        System.out.println(testMaximum("Apple", "Peach", "Banana"));
    }
}
