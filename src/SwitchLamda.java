public class SwitchLamda {
    /**
     * @param args
     */
    public static void main(String[] args) {

        var nilai = "A";
        String ucapan;
        // Switch Lamda mempermudah saat penggunaan switch expression karena kita tidak
        // perlu lagi menggunakan kata kunci break

        // Switch terbagi 2 cara untuk membuatnya

        /*
         * Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata
         * kunci yield untuk mengembalikan nilai pada switch statementIni sangat
         * mempermudah kita ketika butuh membuat data berdasarkan kondisi switch
         * statement
         */

        // 1. Switch lamda tanpa yield
        switch (nilai) {
            case "A" -> ucapan = "Selamat Anda lulus dengan baik";
            case "B", "C" -> ucapan = "Selamat Anda lulus";
            case "D" -> ucapan = "Maaf Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);

        // 2. Switch lamda dengan yield
        ucapan = switch (nilai) {
            case "A":
                yield "Selamat Anda lulus dengan baik";
            case "B", "C":
                yield "Selamat Anda lulus";
            default:
                yield "Mungkin Anda Salah jurusan";
        };
        System.out.println(ucapan);
    }
}