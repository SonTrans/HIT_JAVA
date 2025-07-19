import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh duong tron : ");
        double r = sc.nextFloat();
        final double pi = 3.14;
        double C = 2 * pi * r;
        double S = pi * r * r;
        DecimalFormat df = new DecimalFormat("#.###");
        String chuvi = df.format(C);
        String dientich = df.format(S);
        System.out.println(chuvi + " " + dientich );
    }
}