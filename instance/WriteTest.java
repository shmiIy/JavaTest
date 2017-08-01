import java.io.*;

public class WriteTest {
    public static void main(String args[]) {
        try {
            BufferedWriter doc =
              new BufferedWriter(new FileWriter("runoob.doc"));
            BufferedWriter xls =
              new BufferedWriter(new FileWriter("runoob.xls"));
            BufferedWriter txt =
              new BufferedWriter(new FileWriter("runoob.txt"));
            BufferedWriter png =
              new BufferedWriter(new FileWriter("runoob.png"));
            
            doc.write("There are some test words here.");
            doc.close();
            xls.write("There are some test words here.");
            xls.close();
            txt.write("There are some test words here.");
            txt.close();
            png.write("There are some test words here.");
            png.close();
            
            System.out.println("Create file successfully");
        } catch(IOException e) {}
    }
}