public class Parallelogram {
    final static int height = 52;
    final static int width = 100;
    public static void main(String args[]) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}