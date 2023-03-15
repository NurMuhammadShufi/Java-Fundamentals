
public class KonversiNumber {
    public static void main(String[] args) {
        // Konversi data
        // byte->short->int->long->float->double <-- tipe data number yang bisa
        // dikonversi secara otomatis yaitu dari kiri ke kanan, contoh byte ke int atau
        // byte ke double. jika dari kanan ke kiri itu harus konversi manual

        // otomatis. konversi dari byte ke short
        byte iniByte = 10;
        short iniShort = iniByte;

        // manual.
        int iniInt2 = 1000;
        byte iniByte2 = (byte) iniInt2;

    }
}
