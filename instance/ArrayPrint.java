public class ArrayPrint {
    public static void main(String[] args) {
        String[] greeting = new String[3];
        greeting[0] = "lessons";
        greeting[1] = "tools";
        greeting[2] = "notes";
        for (String s : greeting) {
            System.out.println(s);
        }
    }
}