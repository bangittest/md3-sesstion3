package demoArr;

import java.util.Scanner;

public class DemoArr {
    public static void main(String[] args) {
        int[] arr=new int[4];
        arr[1]=5;
        System.out.println("phan tu thu 2 co gia tri la" + arr[1]);
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int integers[]=new int[size];
        //for i
        for (int i = 0; i < integers.length; i++) {
            integers[i]=i;
            System.out.println(integers[i]);
        }
        //for each
        for (int el:
             integers) {
            System.out.println(el);
        }
        int n=integers.length-1;
        while (n>=0){
            System.out.println(integers[n]);
            n--;
        }


    }

}
