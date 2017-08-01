import java.util.Arrays;

public class ArrayEquals {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {1, 2, 3, 4};
        
        System.out.println("If array equals to array1: " +
          Arrays.equals(array, array1));
        System.out.println("If array1 equals to array2: " +
          Arrays.equals(array1, array2));
    }
}