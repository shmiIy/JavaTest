public class VirtualSalary extends VirtualEmployee {
    private double salary;
    public VirtualSalary(String name, String address,
      int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }
    
    public void mailCheck() {
        System.out.println("Method mailCheck() of class VirtualSalary");
        System.out.println("Mail a check to: " + getName() +
          ", the salary is " + salary);
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double newSalary) {
        if(newSalary >= 0.0) {
            salary = newSalary;
        }
    }
    
    public double computePay() {
        System.out.println("Calculate wages and pay to: " + getName());
        return salary / 52;
    }
}