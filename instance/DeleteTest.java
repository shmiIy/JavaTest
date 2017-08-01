import java.io.*;
public class DeleteTest {
    public static void main(String args[]) {
        try {
            File file = new File("runoob.png");
            if (file.delete()) {
                System.out.println(file.getName() + "file was deleted");
            } else {
                System.out.println("Delete file failed");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}