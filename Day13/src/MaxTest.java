public class MaxTest {
    public static String testMaximum(String a, String b, String c) {
        String max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }
    public static Integer testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }
    public static float testMaximum(float a, float b, float c) {
        float max = a;

        if (b > max)
            max = b;

        if (c > max)
            max = c;

        return max;
    }






}
