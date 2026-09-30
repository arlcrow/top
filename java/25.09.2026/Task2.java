import java.util.Scanner;

public class Task2 {

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    public static String classify(double avg) {
        if (avg >= 7.0) {
            return "Высокий средний балл";
        } else {
            return "Низкий средний балл";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую оценку: ");
        double grade1 = scanner.nextDouble();

        System.out.print("Введите вторую оценку: ");
        double grade2 = scanner.nextDouble();

        System.out.print("Введите третью оценку: ");
        double grade3 = scanner.nextDouble();

        double avg = average(grade1, grade2, grade3);
        String result = classify(avg);

        System.out.println(result);

        scanner.close();
    }
}
