public class MaxTest<T extends Comparable<T>> {

        T a, b, c;

        public MaxTest(T a, T b, T c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public T testMaximum() {
            return MaxTest.testMaximum(a, b, c);
        }

        public static <T extends Comparable<T>> T testMaximum(T a, T b, T c) {

            T max = a;

            if (b.compareTo(max) > 0)
                max = b;

            if (c.compareTo(max) > 0)
                max = c;

            printMax(max);

            return max;
        }

        public static <T> void printMax(T max) {
            System.out.println("Maximum value is: " + max);
        }

}
