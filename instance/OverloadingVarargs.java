public class OverloadingVarargs {
    static void vaTest(int... no) {
        System.out.print("vaTest(int...): " + "number of parameter: " +
          no.length + " contents: ");
        for (int n : no) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    static void vaTest(boolean... no) {
        System.out.print("vaTest(boolean...): " + "number of parameter: " +
          no.length + " contents: ");
        for (boolean n : no) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    static void vaTest(String msg, int... no) {
        System.out.print("vaTest(String, int...): " + "number of parameter: " +
          no.length + " contents: ");
        for (int n : no) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        vaTest(1, 2, 3);
        vaTest(true, false, true);
        vaTest("TEST: ", 10, 15);
    }
}