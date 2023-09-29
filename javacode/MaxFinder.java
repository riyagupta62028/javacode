public class MaxFinder {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 8;
        int num3 = 15;
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The maximum number is: " + max);
    }
}
