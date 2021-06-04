/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Мама", "Мыла", "Раму");
        Set<String> resultSet = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        while (resultSet.size() < 6) {
            Collections.shuffle(list);
            list.stream().forEach(s -> builder.append(s));
            resultSet.add(builder.toString());
            builder.setLength(0);
        }
        for (String x:
             resultSet) {
            System.out.println(x);
        }

    }
}
