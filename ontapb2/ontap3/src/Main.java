import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra : ");
        String chuoi = sc.nextLine().trim().toLowerCase();
        boolean doixung = true;
        int dodai = chuoi.length();
        for (int i = 0; i < dodai / 2; i++) {
            if (chuoi.charAt(i) != chuoi.charAt(dodai - 1 - i)) {
                doixung = false;
                break;
            }
        }
        System.out.println("\nKết quả kiểm tra:");
        System.out.println("Chuỗi nhập vào: " + chuoi);
        System.out.println("Chuỗi đảo ngược: " + new StringBuilder(chuoi).reverse());
        if (doixung) {
            System.out.println("Kết quả: Đây là chuỗi đối xứng ");
        } else {
            System.out.println("Kết quả: Đây KHÔNG phải chuỗi đối xứng");
        }
    }
}