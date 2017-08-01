public class ForAndForeach {
    public static void main(String args[]) {
        int[] intary = {1, 2, 3, 4, 5, 6, 7};
        forDisplay(intary);
        foreachDisplay(intary);
    }
    public static void forDisplay(int[] data) {
        System.out.println("Use for to print array: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
    public static void foreachDisplay(int[] data) {
        System.out.println("Use foreach to print array: ");
        for (int a : data) {
            System.out.print(a + " ");
        }
    }
}