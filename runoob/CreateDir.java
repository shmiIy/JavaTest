import java.io.File;

public class CreateDir {
    public static void main(String args[]) {
        String dirname = "./testDir/CreatDir";
        File d = new File(dirname);
        d.mkdirs();
    }
}