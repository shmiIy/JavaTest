import java.util.ArrayList;

public class ArrayDelete {
    public static void main(String[] args) {
        ArrayList<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0, "The zeroth element");
        objArray.add(1, "The first element");
        objArray.add(2, "The second element");
        System.out.println("Array before delete: " + objArray);
        objArray.remove(1);
        objArray.remove("The zeroth element");
        System.out.println("Array after delete: " + objArray);
    }
}