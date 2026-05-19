public class Main {
    public static Integer testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args) {

        // TC 1.1 → max at 1st
        System.out.println(testMaximum(30, 20, 10));

        // TC 1.2 → max at 2nd
        System.out.println(testMaximum(10, 40, 20));

        // TC 1.3 → max at 3rd
        System.out.println(testMaximum(10, 20, 50));
    }
}