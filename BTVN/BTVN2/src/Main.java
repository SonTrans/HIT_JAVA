import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 1; i<n;i+=2){
            if (n % 2 ==0) {
                if (i == n -1){
                    break;
                }
            }
            a[i] += Math.abs(a[i-1] - a[i+1]);
        }
        a[n-1] += a[n-2];
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
}