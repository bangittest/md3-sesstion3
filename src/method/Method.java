package method;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        add(scanner);
        String output=display("hello word");



    }
    public static void add(Scanner scanner){

        System.out.println("nhap so thu nhat :");
        int i1=scanner.nextInt();
        System.out.println("nhap so thu hai: ");
        int i2=scanner.nextInt();

        System.out.println("tong hai so la : "+(i1+i2));
    }

    public static String display(String input){
        return input;
    }
}
