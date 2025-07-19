import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int sum = 0;
        int max = a[0];
        for (int i = 0; i < 5; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            sum += a[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("\nTong cac gia tri trong mang la : " + sum);
        System.out.println("\nGia tri lon nhat mang la : " + max);
    }
}