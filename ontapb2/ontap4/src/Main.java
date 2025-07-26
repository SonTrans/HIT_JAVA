import java.util.Scanner;

public class Main {
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        System.out.print("Dãy Fibonacci từ F0 đến F" + n + ": ");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int m = fibonacci(i);
            if (m % 2 != 0) {
                sum += m;
            }
        }
        System.out.println("Tổng các số Fibonacci lẻ trong dãy: " + sum);

    }
}