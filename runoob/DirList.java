import java.io.File;

public class DirList {
    public static void main(String args[]) {
    String dirname = "/WorkSpace";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Catalog " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a catalog");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirname + " is not a catalog");
        }
    }
}