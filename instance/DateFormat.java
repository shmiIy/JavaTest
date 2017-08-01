import java.text.SimpleDateFormat;
import java.util.*;

public class DateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("y-M-d h:m:s a");
        Date date = new Date();
        System.out.println("The time is: " + sdf.format(date));
    }
}