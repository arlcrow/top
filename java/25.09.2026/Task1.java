import java.util.Scanner;

public class Task1 {

    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Введите число " + i + ": ");
            int num = scanner.nextInt();
            
            int result = square(num);
            System.out.println("Квадрат числа " + num + " равен: " + result);
        }
        
        scanner.close();
    }
}
