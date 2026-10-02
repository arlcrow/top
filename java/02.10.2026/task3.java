import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    
    int[] numbers = {10, 25, 42, 7, 100};

    System.out.print("Введите индекс массива (0-4): ");
    int index = scanner.nextInt();

    System.out.print("Введите делитель: ");
    int divisor = scanner.nextInt();

    try {
        int value = numbers[index];
        int result = value / divisor;
        
        System.out.println("Элемент: " + value + ", результат деления: " + result);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Ошибка: указан индекс вне границ массива!");
    } catch (ArithmeticException e) {
        System.out.println("Ошибка: делитель равен 0, деление невозможно!");
    } finally {
        System.out.println("Попытка обработки завершена");
    }
}
