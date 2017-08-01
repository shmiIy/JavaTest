import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp);
        SimpleDateFormat sdf = new SimpleDateFormat("y-M-d");
        System.out.println(sdf);
        String sd =
          sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println(sd);
    }
}