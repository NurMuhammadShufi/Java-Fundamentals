public class Method {
    public static void main(String[] args) {
        sayHelloWorld();
        sayHello("Muhammad", "Shufi");
        System.out.println(sum(200, 200));
    }

    // Method
    public static void sayHelloWorld() {
        System.out.println("Hello World1");
        System.out.println("Hello World2");
    }

    // Method dengan parameter
    public static void sayHello(String firsName, String lastName) {
        System.out.println("Hello " + firsName + " " + lastName);
    }

    // Method Return Value
    public static int sum(int value1, int value2) {
        var total = value1 + value2;
        return total;
    }

}
