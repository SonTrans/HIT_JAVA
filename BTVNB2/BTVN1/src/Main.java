import java.util.Scanner;

public class Main {

    static final String hv = "Square";
    static final String tg = "Triangle";
    static final String t = "Circle";
    static final double PI = 3.14;

    public static double hvuong(double canh) {
        return canh * canh;
    }

    public static double tamgiac(double cao, double day) {
        return (cao * day) / 2;
    }

    public static double tron(double banKinh) {
        return PI * banKinh * banKinh;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập hình dạng viên gạch: ");
        String type = sc.nextLine();
        if (type.equalsIgnoreCase(hv)) {
            System.out.print("Nhập độ dài cạnh hình vuông: ");
            double canh = sc.nextDouble();
            System.out.println("Diện tích hình vuông là: " + hvuong(canh) + " cm²");
        } else if (type.equalsIgnoreCase(tg)) {
            System.out.print("Nhập chiều cao của tam giác: ");
            double day = sc.nextDouble();
            System.out.print("Nhập cạnh đáy của tam giác: ");
            double cao = sc.nextDouble();
            System.out.println("Diện tích tam giác là: " + tamgiac(cao, day) + " cm²");
        } else if (type.equalsIgnoreCase(t)) {
            System.out.print("Nhập bán kính hình tròn: ");
            double r = sc.nextDouble();
            System.out.println("Diện tích hình tròn là: " + tron(r) + " cm²");
        } else {
            System.out.println("Hình dạng không hợp lệ!");
        }

        sc.close();
    }
}