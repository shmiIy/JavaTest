public class StringReplaceEmp {
    public static void main(String args[]) {
        String str = "HeHello WorldHe";
        System.out.println(str.replace('H', 'W'));
        System.out.println(str.replaceFirst("He", "Wa"));
        System.out.println(str.replaceAll("He", "Ha"));
    }
}