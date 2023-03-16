public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = 'A';

        switch (nilai) {
            case 'A':
                System.out.println("Selamat Anda Lulus dengan nilai baik");
                break;
            case 'B':
            case 'C':
                System.out.println("Selamat Anda Lulus");
                break;
            default:
                System.out.println("Anda Tidak lulus");
                break;
        }
    }
}
