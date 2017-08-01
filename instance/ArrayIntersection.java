import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "not common1");
        objArray2.add(3, "not common2");
        
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        objArray.add(2, "not common3");
        
        System.out.println("The elements of array1: " + objArray);
        System.out.println("The elements of array2: " + objArray2);
        
        objArray.retainAll(objArray2);
        System.out.println("The intersection of  array2 and array1 is: " +
          objArray);
    }
}