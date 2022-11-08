// Реализовать алгоритм сортировки вставками

import java.util.Arrays;

class Program {

    public static void main(String[] args) {

        int[] array = { 10, 2, 10, 3, 1, 2, 5, 7, 8, 15, 20, 12, 17, 25, 30 };
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));
    }
}