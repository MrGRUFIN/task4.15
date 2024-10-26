package task4;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        System.out.print("Введите число k: ");
        int k = scanner.nextInt();

        System.out.printf("Сумма чисел = %.3f", getSum(n, k));
    }
    public static double getSum (int n, int k){
        double sum = 0.0;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(i, k);
        }
        return sum;
    }
}