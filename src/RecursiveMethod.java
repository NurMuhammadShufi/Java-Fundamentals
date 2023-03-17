public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println("ini bukan method Recursive : " + factorialLoop(5));
        System.out.println("ini method Recursive : " + factorialRecursive(5));
    }

    public static int factorialLoop(int value) {
        var result = 1;

        for (var counter = 1; counter <= value; counter++) {
            result *= counter;
        }
        return result;
    }

    // Recursive Method
    public static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }

    }

}
