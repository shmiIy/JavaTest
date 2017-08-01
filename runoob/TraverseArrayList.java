import java.util.*;
import java.lang.*;
public class TraverseArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HiaHiaHia");
        
        for(String str : list) {
            System.out.println(str);
        }
        
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for(String str : strArray) {
            System.out.println(str);
        }
        
        Iterator<String> ite = list.iterator();
        while(ite.hasNext()) {
            System.out.println(ite.next());
        }
    }
}