public class OperasiMatematika {
    public static void main(String[] args) {
        /*
         * + -> Penjumlahan
         * - -> Pengurangan
         * * -> Perkalian
         * / -> Pembagian
         * % -> Sisa Pembagian
         */
        int variabel1 = 5;
        int variabel2 = 4;

        // Penjumlahan
        int result1 = variabel1 + variabel2;
        System.out.println("hasil 5 + 4 = " + result1);

        // Pengurangan
        int result2 = variabel1 - variabel2;
        System.out.println("hasil 5 - 4 = " + result2);

        // Perkalian
        int result3 = variabel1 * variabel2;
        System.out.println("hasil 5 x 4 = " + result3);

        // Pembagian
        // konversi dari int ke double agar dapat hasil pecahan
        double newVariabel1 = variabel1;
        double newVariabel2 = variabel2;
        double result4 = newVariabel1 / newVariabel2;
        System.out.println("hasil 5 : 4 = " + result4);

        // Hasil pembagian
        double result5 = newVariabel1 % newVariabel2;
        System.out.println("hasil 5 % 4 = " + result5);

    }
}
