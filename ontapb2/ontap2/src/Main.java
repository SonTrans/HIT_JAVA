import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính r (số thực): ");
        double r = sc.nextDouble();
        System.out.print("Nhập số mũ k (số nguyên): ");
        int k = sc.nextInt();
        double chuVi = 2 * PI * r;
        double dienTich = PI * r * r;
        double rMuk = Math.pow(r, k);
        double canBacHai = Math.sqrt(r + k);
        double giaTriTuyetDoi = Math.abs(r - k);
        System.out.println("\nKết quả tính toán:");
        System.out.printf("\nChu vi hình tròn: " + chuVi);
        System.out.printf("\nDiện tích hình tròn: " + dienTich);
        System.out.printf("\nr^k =  " + rMuk);
        System.out.printf("\nCăn bậc hai của (r+k) :" + canBacHai);
        System.out.printf("\nGiá trị tuyệt đối của (r-k) : " + giaTriTuyetDoi);
    }
}