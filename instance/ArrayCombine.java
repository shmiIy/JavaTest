import java.util.*;

public class ArrayCombine {
    public static void main(String args[]) {
        String a[] = {"A", "E", "I"};
        String b[] = {"O", "U"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}