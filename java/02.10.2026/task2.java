import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    int number;

    while (true) {
        System.out.print("Введите число: ");
        String input = scanner.nextLine();

        try {
            number = Integer.parseInt(input);
            break;
        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        }
    }

    System.out.println("Вы успешно ввели число: " + number);
}
