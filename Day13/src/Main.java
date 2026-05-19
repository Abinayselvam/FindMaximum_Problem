public class Main {
    public static void main(String[] args) {

        // Integers
        MaxTest.testMaximum(10, 20, 30, 40, 5);

        // Floats
        MaxTest.testMaximum(2.3f, 5.6f, 1.1f, 9.8f);

        // Strings
        MaxTest.testMaximum("Apple", "Peach", "Banana", "Mango");

        // Edge case
        MaxTest.testMaximum(100);
    }
}