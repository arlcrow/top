import java.util.Arrays;

void main() {
    int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    if (array == null || array.length == 0) {
        System.out.println("Массив пуст");
        return;
    }

    int maxSoFar = array[0];
    int currentMax = array[0];

    int start = 0;
    int end = 0;
    int tempStart = 0;

    for (int i = 1; i < array.length; i++) {
        if (array[i] > currentMax + array[i]) {
            currentMax = array[i];
            tempStart = i;
        } else {
            currentMax += array[i];
        }

        if (currentMax > maxSoFar) {
            maxSoFar = currentMax;
            start = tempStart;
            end = i;
        }
    }

    int[] subArray = Arrays.copyOfRange(array, start, end + 1);

    System.out.println("Максимальная сумма = " + maxSoFar);
    System.out.println("Подмассив: " + Arrays.toString(subArray));
    System.out.println("Индексы: [" + start + ", " + end + "]");
}
