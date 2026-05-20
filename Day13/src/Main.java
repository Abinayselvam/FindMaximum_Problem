public class Main {



        public static void main(String[] args) {
            System.out.println("Test  the maximum.");
            //UC2
           System.out.println(MaxTest.testMaximum(3.5f, 2.1f, 1.9f));
            System.out.println(MaxTest.testMaximum(1.2f, 5.6f, 3.3f));
            System.out.println(MaxTest.testMaximum(1.2f, 3.3f, 7.8f));
            // TC 1.1 → max at 1st
            System.out.println(MaxTest.testMaximum(30, 20, 10));

            // TC 1.2 → max at 2nd
            System.out.println(MaxTest.testMaximum(10, 40, 20));

            // TC 1.3 → max at 3rd
            System.out.println(MaxTest.testMaximum(10, 20, 50));
            //UC3
            System.out.println(MaxTest.testMaximum("Peach", "Apple", "Banana"));
    }

}