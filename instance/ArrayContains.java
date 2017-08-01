import java.util.ArrayList;

public class ArrayContains {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        ArrayList<String> objArray2 = new ArrayList<String>();
        
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "not common1");
        objArray2.add(3, "not common2");
        
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        
        System.out.println("The elements of objArray: " + objArray);
        System.out.println("The elements of objArray2: " + objArray2);
        System.out.println("If the objArray contains common2: " +
          objArray.contains("common1"));
        System.out.println("If the objArray2 contains objArray: " +
          objArray.contains(objArray));
        
    }
}