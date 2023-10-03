package bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] arr={0,1,2,3,4,5,6,7,8};

        System.out.println("nhap gia tri phan tu can xoa :");
        int deltedEl=scanner.nextInt();
        System.out.println("mang sau khi xoa");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.println(arr[i]);
            if (arr[i]==deltedEl){
                for (int j = i; j < arr.length-1; j++) {
                    arr[j]=arr[j+1];
                }
                arr[arr.length-1]=0;
                break;
            }
        }
    }
}
