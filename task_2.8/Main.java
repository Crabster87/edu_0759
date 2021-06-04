/*
Задание: Дан массив с элементами [2, 3, 4, 5]. С помощью цикла for найдите произведение
элементов этого массива.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /** Solution in according to condition */

        int[] array = {2, 3, 4, 5};
        int multiplication = 1;
        for (int i = 0; i < array.length; i++) {
            multiplication *= array[i];
        }
        System.out.println(multiplication);

        /** My solution for practice */

        System.out.println(Arrays.stream(array).reduce((left, right) -> left * right).getAsInt());
    }

}
