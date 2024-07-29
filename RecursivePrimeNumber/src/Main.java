import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println(number + " sayısı ASAL değildir!");
        } else {
            boolean result = isPrime(number, number - 1);
            if (result) {
                System.out.println(number + " sayısı ASALDIR!");
            } else {
                System.out.println(number + " sayısı ASAL değildir!");
            }
        }
    }
}