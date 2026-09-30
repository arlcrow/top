void main() {
    int[] array = {10, 5, 10, 8, 8, 3};

    Integer firstMax = null;
    Integer secondMax = null;

    for (int num : array) {
        if (firstMax == null || num > firstMax) {
            secondMax = firstMax;
            firstMax = num;
        } 
        else if (num < firstMax && (secondMax == null || num > secondMax)) {
            secondMax = num;
        }
    }

    if (secondMax != null) {
        System.out.println("Второй по величине уникальный элемент: " + secondMax);
    } else {
        System.out.println("Второго уникального элемента нет (в массиве меньше 2 различных чисел).");
    }
}
