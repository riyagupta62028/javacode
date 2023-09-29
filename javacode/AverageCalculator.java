public class AverageCalculator {
    public static void main(String[] args) {
        double[] numbers = { 4.5, 6.0, 9.5, 2.5, 8.0 };
        double sum = 0;

        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
