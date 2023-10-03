package bai7;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "]["+ j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

        int tongDuongCheo = 0;

        // Tính tổng của đường chéo chính
        for (int i = 0; i < n; i++) {
            tongDuongCheo += A[i][i];
        }

        System.out.println("Tổng của đường chéo chính: " + tongDuongCheo);

        int tongDuongCheoPhu=0;
        for (int i = 0; i < n; i++) {
            tongDuongCheoPhu+=A[i][n-1-i];
        }
        System.out.println("Tong cua duong cheo phu: " +tongDuongCheoPhu);


    }
}
