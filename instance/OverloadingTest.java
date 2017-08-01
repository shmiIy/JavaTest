class House {
    int height;
    House() {
        System.out.println("Structor without parameter");
        height = 4;
    }
    House(int h) {
        System.out.println("The height of the house is: " + h + " meters");
        height = h;
    }
    void info() {
        System.out.println("The height of the house is: " +
          height + " meters");
    }
    void info(String s) {
        System.out.println(s + ": The height of the house is: " +
          height + " meters");
    }
}

public class OverloadingTest {
    public static void main(String[] args) {
        House h = new House(3);
        h.info();
        h.info("Overloading");
        new House();
    }
}