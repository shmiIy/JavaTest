import java.io.*;
public class EmployeeTest{
    public static void main(String args[]) {
        Employee empOne = new Employee("TESTOR1");
        Employee emoTwo = new Employee("TESTOR2");
        
        empOne.empAge(26);
        empOne.empDesignation("Old programmer");
        empOne.empSalary(10000);
        empOne.printEmployee();
        
        emoTwo.empAge(20);
        emoTwo.empDesignation("New programmer");
        emoTwo.empSalary(5000);
        emoTwo.printEmployee();
    }
}