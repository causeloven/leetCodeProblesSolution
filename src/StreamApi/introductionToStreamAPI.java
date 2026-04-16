package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class introductionToStreamAPI {
    public static void introductionToStreamAPI() {

        List<Integer> salaries = Arrays.asList(50000, 120000, 80000, 150000, 90000);

        //я не разбираюсь в лямбда выражениях
        List<Integer> goodSalaries = salaries.stream().filter(s -> s > 100000).collect(Collectors.toList());
        List<Double> goodSalaries2 = salaries.stream().map(s -> s * 0.87).collect(Collectors.toList());
        List<Double> goodSalaries3 = salaries.stream().filter(s -> s >= 90000)
                .map(s -> s * 0.87).sorted((a,b) -> b.compareTo(a)).
                collect(Collectors.toList());

        System.out.println(goodSalaries);
        System.out.println(goodSalaries2);
        System.out.println(goodSalaries3);

        List<String> cars = Arrays.asList(
                "Audi", "BMW", "Mercedes", // 1 страница
                "Lexus", "Toyota", "Honda", // 2 страница
                "Ford", "Chevrolet", "Dodge", // 3 страница
                "Kia" // 4 страница (остаток)
        );
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите страницу с машинами: ");
        long page = sc.nextLong();
        sc.close();
        page--;
        long skip = 3 * page;
        long limit = 3;

        List<String> carsPage = cars.stream().skip(skip).
                limit(limit).collect(Collectors.toList());

        System.out.println(carsPage);

        List<Integer> expenses = Arrays.asList(45000, 150000, 80000, 300000);
        int totalExpenses = expenses.stream().reduce(0, (acc, x) -> acc+x);
        System.out.println(totalExpenses);

    }
}
