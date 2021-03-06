/*
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи
Лондон
Пример вывода:
Абрамовичи */


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Модернизация ПО
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = scanner.nextLine();
            if (city.isEmpty()) {
                break;
            }
            String family = scanner.nextLine();
            map.put(city, family);
        }

        // Read the city
        String homeCity = scanner.nextLine();
        if (map.containsKey(homeCity)) System.out.println(map.get(homeCity));
        else
            System.out.println("Nobody lives in this city");
    }


    /** Version with numbers of houses

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while (true) {
            String family = scanner.nextLine();
            if (family.isEmpty()) {
                break;
            }

            list.add(family);
        }

        // Read the house number
        int houseNumber = scanner.nextInt();

        if (0 <= houseNumber && houseNumber < list.size()) {
            String familyName = list.get(houseNumber);
            System.out.println(familyName);
        }
    }
    */

}
