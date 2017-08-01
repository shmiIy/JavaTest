public class StringReverseExample {
    public static void main(String[] args) {
        String string = "runoob";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("Before reverse: " + string);
        System.out.println("After reverse: " + reverse);
    }
}