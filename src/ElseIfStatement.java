public class ElseIfStatement {
    public static void main(String[] args) {
        int nilai = 100;
        int absen = 79;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Selamat Anda lulus dengan nilai A");
        } else if (nilai >= 70 && absen >= 70) {
            System.out.println("Selamat Anda lulus dengan nilai B");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Selamat Anda lulus dengan nilai C");
        } else if (nilai >= 50 && absen >= 50) {
            System.out.println("Maafa Anda tidak lulus, nilai anda D");
        } else {
            System.out.println("Maaf Anda tidak lulus, nilai anda E");
        }
    }
}
