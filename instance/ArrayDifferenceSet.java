import java.util.ArrayList;

public class ArrayDifferenceSet {
    public static void main(String[] arg) {
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
        
        objArray.removeAll(objArray2);
        System.out.println("The difference set of array1 and array2 is: " +
          objArray);
    }
}