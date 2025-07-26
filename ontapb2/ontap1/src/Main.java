import java.util.Scanner;
public class Main {
    public static boolean ngto(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng (n): ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhập các số nguyên:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int tongChan = 0;
        int tongLe = 0;
        int soLuongSoNguyenTo = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                tongChan += num;
            } else {
                tongLe += num;
            }
            if (ngto(num)) {
                soLuongSoNguyenTo++;
            }
        }
        System.out.println("Tổng các số chẵn: " + tongChan);
        System.out.println("Tổng các số lẻ: " + tongLe);
        System.out.println("Số lượng số nguyên tố trong mảng: " + soLuongSoNguyenTo);

    }
}