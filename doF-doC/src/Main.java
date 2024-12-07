import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Hello. What do you want to convert");
            System.out.println("1. Fahrenheit to Celsius.");
            System.out.println("2. Celsius to Fahrenheit.");
            System.out.println("0. Exit.");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhap do Fahrenheit");
                    int doF = sc.nextInt();
                    System.out.println(fahrenheitToCelsius(doF));
                    break;
                case 2:
                    System.out.println("Nhap do Celsius");
                    int doC = sc.nextInt();
                    System.out.println(celsiusToFahrenheit(doC));
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
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