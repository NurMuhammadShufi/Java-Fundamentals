public class TipeDataArray {
    public static void main(String[] args) {
        // Cara 1 Membuat Array
        String[] stringName;
        stringName = new String[3];

        // Input data ke Array stringName
        stringName[0] = "Nur";
        stringName[1] = "Muhammad";
        stringName[2] = "Shufi";

        // Memanggil Array stringName
        System.out.println(stringName[0]);
        System.out.println(stringName[1]);
        System.out.println(stringName[2]);

        // Mengubah data Array stringName
        stringName[0] = "Moses";
        System.out.println(stringName[0]);

        System.out.println();

        // Cara 2 Membuat Array
        int[] arrayInt = new int[] {
                10, 20, 30, 40, 50
        };

        int[] arrayIntNew = {
                1, 2, 3, 4, 5
        };

        long[] arrayLong = {
                60L, 70L, 80L, 90L, 100L
        };

        // Menampilkan isi arrayInt ke dalam console
        System.out.print("Isi arrayInt: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print(arrayInt[i] + " ");
        }
        System.out.println();

        // Menampilkan isi arrayIntNew ke dalam console
        System.out.print("Isi arrayIntNew: ");
        for (int i = 0; i < arrayIntNew.length; i++) {
            System.out.print(arrayIntNew[i] + " ");
        }
        System.out.println();

        // Menampilkan isi arrayLong ke dalam console
        System.out.print("Isi arrayLong: ");
        for (int i = 0; i < arrayLong.length; i++) {
            System.out.print(arrayLong[i] + " ");
        }
        System.out.println();
        System.out.println();

        // Array didalam Array
        String[][] name = {
                { "Nur", "Muhammad", "Shufi" },
                { "Jacob", "Taslim", "Purwanto" },
                { "Andi", "Sudisto" }
        };

        System.out.print("Array object pertama : ");
        for (int i = 0; i < name[0].length; i++) {
            System.out.print(name[0][i] + " ");
        }
        System.out.println();

        System.out.println(name[1][0]);
        System.out.println(name[2][1]);

    }
}
