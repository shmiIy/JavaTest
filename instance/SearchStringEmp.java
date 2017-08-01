public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Google Runoob Taobao Runoob";
        int intIndex = strOrig.indexOf("Runoob");
        if (intIndex == -1) {
            System.out.println("Can't find string Runoob");
        } else {
            System.out.println("Position of Runoob is: " + intIndex);
        }
    }
}