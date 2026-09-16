import java.util.Scanner;
import java.util.Locale;

void main() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Введите вещественное число (например, 7.9): ");
    
    double number = scanner.nextDouble();
    int intNumber = (int) number;
    
    System.out.println("Исходное double: " + number);
    System.out.println("Результат приведения к int: " + intNumber);

    scanner.close();
}
