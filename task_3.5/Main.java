/*
Задание: Дан массив с числами. Выведите последовательно его элементы
используя рекурсию и не используя цикл.
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num[] = {4, 2, 6, 2, 65};
        System.out.println("Enter index " + "from 0 to " + (num.length - 1)
                            + ", starting from which you want to print the array:");
        int firstIndex = scanner.nextInt();
        printArray(num, firstIndex);
    }

    public static void printArray(int[] array, int index) {
        if (index <= array.length - 1) {
            System.out.print(array[index] + " ");
            printArray(array, index + 1);
        }
    }

    /**
     * If taking out an array as a class variable

    public static int[] num = {4, 2, 6, 2, 65};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter index " + "from 0 to " + (num.length - 1)
                + ", starting from which you want to print the array:");
        int firstIndex = scanner.nextInt();
        printArray(firstIndex);
    }

    public static void printArray(int index) {
        if (index <= num.length - 1) {
            System.out.print(num[index] + " ");
            printArray(index + 1);
        }
    }
     */
}
