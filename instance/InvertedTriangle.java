public class InvertedTriangle {
    final static int SIDE = 16;
    public static void main(String[] args) {
        for (int i = SIDE; i >0; i--) {
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