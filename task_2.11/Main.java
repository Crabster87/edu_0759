/*
Задание: Дан массив с числами. Узнайте сколько элементов с начала массива надо сложить,
чтобы в сумме получилось больше 10-ти.
*/

public class Main {
    public static void main(String[] args) {
        int[] array = {2, 4, 3, 1, 6, 4, 8, 9};
        int sum = array[0];
        int countOperations = 1; // int sum = array[0] was the first operation
        int i = 0;
        if (sum < 10) {
            while (i < array.length - 1) {
                if (sum == 10) break;
                sum = sum + array[i + 1];
                countOperations++;
                i++;
            }
            System.out.println("Quantity of required elements: " + countOperations);
        } else {
            System.out.println("The first element is grater than or equal to 10");
        }
    }
}
