package bai6;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào bậc của ma trận: ");
        n = scanner.nextInt();

        int A[][] = new int[n][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A vừa nhập:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        int[] tongCot = new int[n]; // Mảng lưu tổng của từng cột

        // Tính tổng của từng cột và lưu vào mảng tongCot
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                tongCot[j] += A[i][j];
            }
        }

        // In tổng của từng cột
        for (int j = 0; j < n; j++) {
            System.out.println("Tổng cột " + j + " = " + tongCot[j]);
        }
        scanner.close();
    }
}

