import java.util.Scanner;
import java.util.Locale;

void main() {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Введите сумму денег (например, 156.78): ");
    
    double money = scanner.nextDouble();
    
    int rubles = (int) money;
    int kopecks = (int) Math.round((money - rubles) * 100);
    
    System.out.println("Форматированный вывод: " + rubles + " руб " + kopecks + " коп");
    System.out.println("Если наивно взять только (int) сумма: " + rubles + " руб. (а дробная часть " + (money - rubles) + " просто отбрасывается/теряется)");

    scanner.close();
}
