package bth4;

import java.util.Scanner;

public class Bth4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. F đến độ C:");
            System.out.println("2. Độ C đến độ F");
            System.out.println("0. Thoat");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("F đến độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;

                case 2:
                    System.out.println("Nhập độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C đến độ F: " + celsiusToFahrenheit(celsius));
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}