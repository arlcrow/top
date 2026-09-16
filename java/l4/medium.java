import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите одну строчную букву латинского алфавита (например, a): ");
    
    char lowerCaseChar = scanner.next().charAt(0);
    char upperCaseChar = (char) (lowerCaseChar - 32);
    
    System.out.println("Заглавная буква: " + upperCaseChar);

    scanner.close();
}
