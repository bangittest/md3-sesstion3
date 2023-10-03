package bai2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] array={3,5,7,8,5,4};

        System.out.println("mang ban dau:");
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);
        }
        System.out.println(array[array.length-1]);
        System.out.print("nhap phan tu can them");
        int X=scanner.nextInt();

        int[]newArray=new int[array.length+1];
        for (int i=0;i<array.length;i++){
            newArray[i]=array[i];
        }
        newArray[array.length]=X;
        array=newArray;

        System.out.println("mang moi sau khi them: ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);

        scanner.close();

    }
}
