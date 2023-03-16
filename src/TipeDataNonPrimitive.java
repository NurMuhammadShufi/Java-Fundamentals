public class TipeDataNonPrimitive {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer newInt = 100;

        Character newChar;
        newChar = null;

        // float salary; <- error karena tidak diinput valuenya

        System.out.println(newInt);
        System.out.println(newChar);

        // Konversi dari Primitive
        int oldInt = 500;
        System.out.println(oldInt);

        Integer convertToObject = oldInt;
        System.out.println(convertToObject);

        char oldSymbol = 'S';
        System.out.println(oldSymbol);

        Character newSymbol = oldSymbol;
        System.out.println(newSymbol);

        String oldName = "Shufi";
        System.out.println(oldName);

        String newName = oldName;
        System.out.println(newName);

        // Konversi dari Non Primitive
        Integer newInteger = 150;
        System.out.println(newInteger);

        int oldInteger = newInteger;
        System.out.println(oldInteger);
    }
}
