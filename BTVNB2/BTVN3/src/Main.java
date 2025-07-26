import java.util.Random;
import java.util.Scanner;

public class Main {

    public static String check(int a, int b, int c) {
        String kq;
        if (a + b == c) {
            kq = "dung";
        } else {
            kq = "sai";
        }
        return kq;
    }
    public static void dudoan(String d, Scanner sc) {
        System.out.print("Dự đoán kết quả của phép toán (dung/sai): ");
        String dapan = sc.nextLine().toLowerCase().trim();
        if (dapan.equals(d)) {
            System.out.println("Bạn dự đoán đúng!!");
        } else {
            System.out.println("Bạn dự đoán sai!!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int a = rand.nextInt(0, 101);
        int b = rand.nextInt(0, 101);
        int c = rand.nextInt(0, 201);

        System.out.println("Phép toán của bạn là:");
        System.out.println(a + " + " + b + " = " + c);
        String d = check(a,b,c);
        dudoan(d,sc);
    }
}