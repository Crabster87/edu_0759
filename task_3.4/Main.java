/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа.
Если их сумма больше 10 - пусть функция вернет true, а если нет - false.

*/


public class Main {
    public static void main(String[] args) {
        System.out.println(verifySum(8.5, 9.8));
        System.out.println(verifySum(2.1, 4.6));
        System.out.println(verifySum(8.2, 3.0));
        System.out.println(verifySum(6.8, 3.1));
        System.out.println(verifySum(9.4, 0.7));

    }

    public static boolean verifySum(double x, double y) {
        return x + y > 10;
    }

}
