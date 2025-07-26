import java.util.Scanner;
public class Main {
    public static boolean doixung(String str) {
        int trai = 0;
        int phai = str.length() - 1;
        while (trai < phai) {
            if (str.charAt(trai) != str.charAt(phai)) {
                return false;
            }
            trai++;
            phai--;
        }
        return true;
    }
    public static void ktra(String input) {
        if (doixung(input)) {
            System.out.println(input.toUpperCase());
            System.out.println("Chuỗi này đối xứng");
        } else {
            System.out.println(input.toLowerCase());
            System.out.println("Chuỗi này không đối xứng");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = sc.nextLine();
        ktra(input);
    }
}