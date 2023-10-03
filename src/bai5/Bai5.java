package bai5;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] arr;

        do {
            System.out.print("Nhập kích thước mảng (tối đa 20): ");
            size = scanner.nextInt();
            if (size > 20 || size < 1) {
                System.out.println("Kích thước mảng phải từ 1 đến 20.");
            }
        } while (size > 20 || size < 1);

        arr = new int[size];

        // Nhập các phần tử của mảng từ bàn phím
        for (int i = 0; i < size; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int index = minValue(arr);
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[index]) {
                index = i;
            }
        }
        return index;
    }
}
