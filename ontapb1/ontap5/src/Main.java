import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bang cuu chuong 5 :");
        for (int i = 1 ; i <= 10; i++){
            System.out.println("5 x " + i + " = " + 5*i);
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 ==0){
                sum += i;
            }
        }
        System.out.println("Tong cac so chan tu 1 --> 100 la : " + sum);
    }
}