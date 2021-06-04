/*
ВНИМАНИЕ эта задача для ДЗ и не является обязательной.
Задание: 1. Создай массив чисел.
2. Добавь в массив 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /** Filling of the array */

        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter number N " + (i + 1) + " from 10");
            array[i] = scanner.nextInt();
        }

        /** Working with numbers */

        int maxLength = 1;
        int intermediateVar = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                intermediateVar++;
            } else if (intermediateVar > maxLength) {
                maxLength = intermediateVar;
                intermediateVar = 1;
            } else {
                intermediateVar = 1;
            }
        }
        System.out.println(maxLength);
    }

}
