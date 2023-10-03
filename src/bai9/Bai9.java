package bai9;

public class Bai9 {
    public static void main(String[] args) {
        int[]arr={5,10,15,20,25,30};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for (int j : arr) {
            if (j > max1) {
                max2 = max1;
                max1 = j;
            } else if (j > max2 && j != max1) {
                max2 = j;
            }
        }
        System.out.println("so lon thu 2 trong mang la : " +max2);
    }
}
