import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("1. Sum of Even Digits");
        System.out.println("2. Sum of Odd Digits");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;

            if (choice == 1 && digit % 2 == 0) {
                sum += digit;
            }
            else if (choice == 2 && digit % 2 != 0) {
                sum += digit;
            }

            num = num / 10;
        }

        System.out.println("Sum = " + sum);
    }
}