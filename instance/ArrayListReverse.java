import java.util.*;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        arrayList.add("F");
        System.out.println("The sort before reverse: " + arrayList);
        Collections.reverse(arrayList);
        System.out.println("The sort after reverse: " + arrayList);
    }
}