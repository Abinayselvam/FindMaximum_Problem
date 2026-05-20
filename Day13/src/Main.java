public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test  the maximum.");

        MaxTest<Integer> intMax = new MaxTest<>(10, 20, 30);
        intMax.testMaximum();

        MaxTest<Float> floatMax = new MaxTest<>(2.3f, 5.6f, 1.1f);
        floatMax.testMaximum();

        MaxTest<String> stringMax = new MaxTest<>("Apple", "Peach", "Banana");
        stringMax.testMaximum();

    }
}