public class BreakTest {
    public static void main(String args[]) {
        int[] intary = {99, 12, 22, 34, 45, 67, 5678, 8900};
        int no = 5678;
        int index;
        boolean found = false;
        for (index = 0; index < intary.length; index++) {
            if (intary[index] == no) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("The index location of element " +
              no + " is: " + index);
        } else {
            System.out.println("The element " + no +
              " is not in this array");
        }
    }
}