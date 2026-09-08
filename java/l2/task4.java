import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("введите фио:");
    String fio = scanner.nextLine();
    
    System.out.println("введите год рождения:");
    int year = scanner.nextInt();
    
    System.out.println("введите двузначное число:");
    int num = scanner.nextInt();
    
    int space1 = fio.indexOf(' ');
    
    String result = 
        fio.substring(0, 1).toUpperCase() + 
        fio.substring(space1 + 1, space1 + 4).toLowerCase() + 
        fio.charAt(fio.length() - 1) + 
        "_" + 
        (year / 1000 + (year / 100) % 10 + (year / 10) % 10 + year % 10) + 
        "_" + 
        ((num % 10) * 10 + (num / 10));
        
    System.out.println("Результат: " + result);
    
    scanner.close();
}
