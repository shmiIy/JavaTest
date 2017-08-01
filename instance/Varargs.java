public class Varargs {
    static int sumvarargs (int... intArrays) {
        int sum = 0;
        for (int i : intArrays) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String args[]) {
        int sum = 0;
        sum = sumvarargs(new int[] {10, 12, 33, 42});
        System.out.println("The sum of the numbers is: " + sum);
    }
}