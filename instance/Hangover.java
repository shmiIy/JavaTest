import java.util.*;

public class Hangover {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            float sum = scan.nextFloat();
            if (sum == 0.00) break;
            int cards = 0;
            float i = 2;
            while (sum > 0) {
                sum -= (1 / i);
                i++;
                cards++;
            }
            System.out.println(cards + " card(s)");
        }
    }
}

