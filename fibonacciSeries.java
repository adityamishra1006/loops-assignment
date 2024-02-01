import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms : ");
        int n = sc.nextInt();

        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;

        System.out.println("Fibonacci series of " + n + " numbers:");

        for (int i = 2; i < n; i++) {
            fibSeries[i] = fibSeries[i - 1] + fibSeries[i - 2];
        }

        for (int num : fibSeries) {
            System.out.print(num + " ");
        }
    }
}
