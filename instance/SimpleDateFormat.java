import java.text.*;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "y-M-d H:m:s";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}