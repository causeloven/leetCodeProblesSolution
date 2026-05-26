package foodTracker.old;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean isWork = true;

        MealManager mealManager = new MealManager();

        Scanner sc = new Scanner(System.in);
        String userQuery = "";

        while(isWork){

            System.out.println("1: Посмотреть съеденное");
            System.out.println("2: Добавить блюдо");
            System.out.println("3: Удалить последнее добавленное блюдо");
            System.out.println("4: Закрыть приложение");

            userQuery = sc.nextLine();

            switch (userQuery){
                case ("1"):
                    mealManager.mealsList();
                    break;
                case ("2"):
                    mealManager.addMeal(sc);
                    break;
                case ("3"):
                    mealManager.removeLastMeal();
                    break;
                case ("4"):
                    isWork = false;
                    System.out.println("Приложение закрылось");
                    break;
                default:
                    System.out.println("Неизвестная команда");
            }

        }
        sc.close();
    }
}
