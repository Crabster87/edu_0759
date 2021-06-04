
/* 
1. Ввести путь к файлу с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10
Пример вывода:
-2
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file's pass");
        String path = scanner.nextLine();

        /** First way */
        List<Integer> list = new ArrayList<>();
        scanner = new Scanner(new FileInputStream(path));
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        list.stream().filter(integer -> integer % 2 == 0).sorted().forEach(System.out::println);

        /** Second way */
        List<Integer> list2 = new ArrayList<>();
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(
                                             new InputStreamReader(
                                             new FileInputStream(path)))) {
            while ((line = bufferedReader.readLine()) != null) {
                list2.add(Integer.parseInt(line));
            }
        }
        list2.stream().filter(integer -> integer % 2 == 0).sorted().forEach(System.out::println);
    }

}
