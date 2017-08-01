public class AbstractDemo {
    public static void main(String[] args) {
        AbstractSalary s = new AbstractSalary("Mohd Mohtashim",
          "Ambehta, UP", 3, 3600.00);
        AbstractEmployee e = new AbstractSalary("John Adams",
          "Boston, MA", 2, 2400.00);
        
        System.out.println("Call mailCheck using AbstractSalary renference");
        s.mailCheck();
        
        System.out.println();
        System.out.println("Call mailCheck using AbstractEmployee renference");
        e.mailCheck();
    }
}