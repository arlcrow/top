void main() {
    int[] array = {3, 8, 5, 12, 7, 4};

    int sumEven = 0;
    for (int num : array) {
        if (num % 2 == 0) {
            sumEven += num;
        }
    }

    System.out.println("Сумма чётных элементов = " + sumEven);
}
