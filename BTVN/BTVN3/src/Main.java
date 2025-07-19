import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc ma tran n : ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int num = 1;
        int tren = 0, duoi = n - 1;
        int trai = 0, phai = n - 1;
        while (num <= n * n) {
            for (int i = trai; i <= phai; i++) {
                matrix[tren][i] = num++;
            }
            tren++;
            for (int i = tren; i <= duoi; i++) {
                matrix[i][phai] = num++;
            }
            phai--;
            for (int i = phai; i >= trai; i--) {
                matrix[duoi][i] = num++;
            }
            duoi--;
            for (int i = duoi; i >= tren; i--) {
                matrix[i][trai] = num++;
            }
            trai++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}