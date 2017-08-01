public class VirtualDemo {
    public static void main(String[] args) {
        VirtualSalary s = new VirtualSalary("Employee A", "Beijing", 3, 3600.00);
        VirtualEmployee e = new VirtualSalary("Employee B", "Shanghai", 2, 2400.00);
        System.out.println("Use the reference of VirtualSalary to call mailCheck()");
        s.mailCheck();
        System.out.println();
        System.out.println("Use the reference of VirtualEmployee to call mailCheck()");
        e.mailCheck();
    }
}