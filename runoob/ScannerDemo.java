import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Receive by \'next\'");
        
        if(scan.hasNext()) {
            String strl = scan.next();
            System.out.println("The input is: " + strl);
        }
        
        if(scan.hasNextLine()) {
            String str2 = scan.nextLine();
            System.out.println("The input is: " + str2);
        }
    }
}
