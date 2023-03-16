public class OperasiBoolean {
    public static void main(String[] args) {
        /*
         * && Dan
         * || Atau
         * ! Kebalikan
         */

        var absen = 75;
        var nilaiAkhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAkhir >= 75;

        boolean lulus = lulusAbsen && lulusNilai;
        System.out.println("Anda di nyatakan : " + lulus);
    }
}
