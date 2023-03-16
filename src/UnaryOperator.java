public class UnaryOperator {
    public static void main(String[] args) {
        /*
         * ++ -> a = a + 1
         * -- -> a = a - 1
         * - -> Negative
         * + -> Positive
         * ! -> Boolean kebalikan
         */

        int d = 100; // Positif 100
        int e = -100; // Negatif 100
        System.out.println(d);
        System.out.println(e);

        System.out.println();

        d++; // Positif 100 + 1 atau 100 + 1
        System.out.println(d);

        e--; // Negatif 100 - 1 atau -100 - 1
        System.out.println(e);
    }
}
