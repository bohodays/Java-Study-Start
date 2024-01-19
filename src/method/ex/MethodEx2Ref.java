package method.ex;
public class MethodEx2Ref {
    public static void main(String[] args) {
        String message = "Hello, world!";
        printLoof(message, 3);
        printLoof(message, 5);
        printLoof(message, 7);
    }

    public static void printLoof(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }
}