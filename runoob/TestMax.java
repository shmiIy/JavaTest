public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 10;
        int k = max(i, j);
        System.out.println(i + " and " + j + ", the biger one is: " + (i > j ? i : j));
    }
    
    public static int max(int num1, int num2){
        int result;
        if (num1 > num2) result = num1;
        else result = num2;
        return result;
    }
}