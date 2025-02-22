import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Количество элементов должно быть больше нуля.");
            return;
        }

        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;
        System.out.println("Среднее арифметическое: " + average);

        scanner.close();
    }
}
