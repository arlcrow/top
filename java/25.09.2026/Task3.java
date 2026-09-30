import java.util.Scanner;

public class Task3 {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int countDigits(int number) {
        number = Math.abs(number);
        
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            count++;
            number = number / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int fact = factorial(n);
        int digits = countDigits(fact);

        System.out.println("Факториал: " + fact + ", количество цифр в нём: " + digits);

        scanner.close();
    }
}
