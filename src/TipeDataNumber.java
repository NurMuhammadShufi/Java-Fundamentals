public class TipeDataNumber {
    public static void main(String[] args) {
        // Integer
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000000;
        long iniLong2 = 1000000000L;

        // Decimal
        float iniFloat = 1.5F;
        double iniDouble = 1.5;

        // Literal
        int decimalInt = 25;
        int hexaDecimal = 0xFFFFFF;
        int binaryDecimal = 0b10101010;

        // Kode : Underscore -> mempermudah dalam membaca
        int amount = 100_000_000;

        System.out.println(iniByte);
        System.out.println(iniShort);
        System.out.println(iniInt);
        System.out.println(iniLong);
        System.out.println(iniLong2);
        System.out.println(iniFloat);
        System.out.println(iniDouble);
        System.out.println(decimalInt);
        System.out.println(hexaDecimal);
        System.out.println(binaryDecimal);
        System.out.println(amount);
    }
}