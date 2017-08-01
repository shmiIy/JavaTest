public class SearchlastString {
    public static void main(String[] args) {
        String strOrig = "Hello world, Hello Runoob";
        int lastIndex = strOrig.lastIndexOf("Runoob");
        if(lastIndex == -1) {
            System.out.println("Can't find string Runoob");
        } else {
            System.out.println("The last position string Runoob apeared: "
              + lastIndex);
        }
    }
}