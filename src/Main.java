public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 13;

        int max = (a > b) ? a : b;

        System.out.println(max);

        if (a > 6) {
            // max = a;
        } else {
            // max = b;
        }
        System.out.println(max);
    }
}