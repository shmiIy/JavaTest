import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) throws Exception {
        String[] array1 = {"1", "2", "3", "4"};
        String[] array2 = {"3", "4", "5", "6"};
        String[] result = union(array1, array2);
        System.out.print("The result of union is: ");
        for (String str : result) {
            System.out.print(str + " ");
        }
    }
    
    public static String[] union(String[] array1, String[] array2) {
        Set<String> set = new HashSet<String>();
        
        for (String str : array1) {
            set.add(str);
        }
        
        for (String str : array2) {
            set.add(str);
        }
        
        String[] result = {};
        return set.toArray(result);
    }
}