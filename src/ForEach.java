public class ForEach {
    public static void main(String[] args) {
        // Tanpa For Each
        String[] names = {
                "Nur", "Muhammad", "Shufi"
        };
        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("===================");

        // Dengan For Each
        String[] newNames = {
                "Nur", "Muhammad", "Shufi"
        };
        for (var name : newNames)
            System.out.println(name);
    }
}
