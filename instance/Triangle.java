public class Triangle {
    final static int SIDE = 2;
    public static void main(String[] args) {
        for (int i = 1; i <= SIDE; i++) {
            for (int j = SIDE - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}