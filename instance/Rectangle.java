public class Rectangle {
    final static int height = 5;
    final static int width = 10;
    public static void main(String args[]) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}