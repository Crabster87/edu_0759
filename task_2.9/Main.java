/*
Задание: Дан массив с числами. Проверьте, что в этом массиве есть число 5.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        boolean flag = Arrays.stream(array).anyMatch(value -> value == 5);
        String answer = flag ? "да" : "нет";
        System.out.println(answer);
    }
}
