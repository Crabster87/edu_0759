/*
Задание: Сделайте функцию, которая параметрами принимает 2 числа. Если эти числа равны - пусть
 функция вернет true, а если не равны - false.
*/


public class Main {

    public static void main(String[] args) {
        System.out.println(numberComparing(10.8, 101));
        System.out.println(numberComparing(5., 5));
        System.out.println(numberComparing(12, 8));
        System.out.println(numberComparing(-65, 0));
        System.out.println(numberComparing(-33.0, -33));
    }

    public static boolean numberComparing(double a, double b) {
        return a == b;
    }

}
