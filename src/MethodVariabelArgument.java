public class MethodVariabelArgument {
    public static void main(String[] args) {
        sayCongrats("Shufi", 100, 85, 60, 80, 85);
    }

    public static void sayCongrats(String name, int... nilai) {
        var total = 0;
        for (var value : nilai) {
            total += value;
        }

        var finalValue = total / nilai.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda tidak lulus");
        }
    }
}
