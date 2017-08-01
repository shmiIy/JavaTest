import java.util.ArrayList;
import java.util.Vector;

public class InstanceOfTest {
    public static void main(String args[]) {
        Object testObject = new ArrayList();
        displayObjectClass(testObject);
    }
    public static void displayObjectClass(Object o) {
        if (o instanceof Vector) {
            System.out.println("Object is the instance " +
              "of java.util.Vector");
        } else if (o instanceof ArrayList) {
            System.out.println("Object is the instance " +
              "of java.util.ArrayList");
        } else {
            System.out.println("Object is the instance " +
              "of " + o.getClass());
        }
    }
}