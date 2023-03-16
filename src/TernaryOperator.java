public class TernaryOperator {
    public static void main(String[] args) {

        // Tanpa Ternary Operator
        var nilai1 = 75;
        String ucapan1;

        if (nilai1 >= 75) {
            ucapan1 = "Selamat Anda Lulus";
        } else {
            ucapan1 = "Maaf Anda tidak Lulus";
        }
        System.out.println(ucapan1);

        // Dengan Ternary Operator
        var nilai2 = 75;
        String ucapan2 = nilai2 >= 75 ? "Selamat Anda Lulus" : "Maaf Anda tidak lulus";
        System.out.println(ucapan2);

    }
}
