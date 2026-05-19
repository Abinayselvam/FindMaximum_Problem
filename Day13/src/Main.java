public class Main {

    public static float testMaximum(float a, float b, float c) {
        float max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }

        public static void main(String[] args) {
            System.out.println(testMaximum(3.5f, 2.1f, 1.9f));
            System.out.println(testMaximum(1.2f, 5.6f, 3.3f));
            System.out.println(testMaximum(1.2f, 3.3f, 7.8f));
        }

}