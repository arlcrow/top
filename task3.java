import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("введите цену первого товара: ");
    double price1 = scanner.nextDouble();
    
    System.out.print("введите цену второго товара: ");
    double price2 = scanner.nextDouble();
    
    System.out.println("общая стоимость: " + (price1 + price2));
    
    scanner.close();
}
