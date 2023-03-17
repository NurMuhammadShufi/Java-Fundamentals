public class ForLoop {
    public static void main(String[] args) {
        // Tanpa init statement
        var counter1 = 1;
        for (; counter1 <= 10;) {
            System.out.println("Perulangan counter 1 ke : " + counter1);
            counter1++;
        }

        System.out.println();

        // Dengan init statement
        for (var counter2 = 1; counter2 <= 10; counter2++) {
            System.out.println("Perulangan counter 2 ke : " + counter2);
        }
    }
}
