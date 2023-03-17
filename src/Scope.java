public class Scope {
    public static void main(String[] args) {
        sayHello("Shufi");
    }

    public static void sayHello(String name) {
        String ucapan1 = "Hello " + name;
        if (!name.isBlank()) {
            String ucapan2 = "Hi " + name;
            System.out.println(ucapan2);
        }

        System.out.println(ucapan1);
        // System.out.println(ucapan2); // <- Error, karena diluar scope / block

    }
}
