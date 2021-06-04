/*
* Задание: Дана коллекция с числами. Запишите в новую коллекцию только те числа,
* которые больше нуля и меньше 10-ти.
* Коллекции вы создаёте сами
*/

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> newList = Stream.of(-1, 4, 9, 34, 90, -5, 6, 0, 67, -18)
                .filter(integer -> integer > 0 && integer < 10)
                .collect(Collectors.toList());

        System.out.println("Checking the result");
        newList.forEach(obj -> System.out.print(obj + "  "));
    }
}
