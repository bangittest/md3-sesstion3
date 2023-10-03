package bai8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Bai8 {
    public static void main(String[] args) {
    final String text="hello word";
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap ki tu muon kiem tra :");
        String textSeach=scanner.nextLine();
        int count= (int) IntStream.range(0, text.length()).filter(i -> text.charAt(i) == textSeach.charAt(0)).count();
        System.out.println("ki tu " +textSeach +" xuat hien " + count + " lan");
    }
}
