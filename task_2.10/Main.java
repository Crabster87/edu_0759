/*
Задание: Дан массив с числами. Проверьте, есть ли в нем два одинаковых числа подряд.
Если есть - выведите 'да', а если нет - выведите 'нет'.
*/

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 6, 7, 9};
        boolean flag = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                flag = true;
            }
        }
        String answer = flag ? "да" : "нет";
        System.out.println(answer);
    }
}
