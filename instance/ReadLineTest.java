import java.io.*;

public class ReadLineTest {
    public static void main(String args[]) {
        try {
            BufferedReader in =
              new BufferedReader(new FileReader("runoob.doc"));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            System.out.println(str);
        } catch(IOException e) {}
    }
}