/*
Задание: Пользователь вводит сумму вклада и процент, который будет начисляться ежегодно. Отобразить размер вклада поочередно на ближайшие 5 лет.
*/

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);

        System.out.println("Enter sum of contribution at first:");
        double sum = scanner.nextDouble();

        System.out.println("Enter a percentage of contribution:");
        double percent = scanner.nextDouble();

        System.out.println("Calculated value for 5 years:");
        Double[] yearlyContribution = new Contribution(sum, percent).calculateEachYearVolume();
        Arrays.stream(yearlyContribution).forEach(System.out::println);

    }

}
