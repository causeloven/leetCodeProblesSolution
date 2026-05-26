package foodTracker.old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MealManager {

    private List<Meal> meals = new ArrayList<>();
    private int defaultLimitOfKkal = 2400;

    public MealManager(){
    }

    public MealManager(int defaultLimitOfKkal){
        this.defaultLimitOfKkal = defaultLimitOfKkal;
    }

    public void addMeal(Scanner sc){

        System.out.print("Введите блюдо: ");
        String name = sc.nextLine();
        System.out.print("Введите ккал блюда: ");
        
        int kkal;
        
        try {
            kkal = Integer.parseInt(sc.nextLine());
            if(kkal < 0){
                System.out.println("Ккал не может быть отрицательным");
                return;
            }
        }catch (NumberFormatException e){
            System.out.println("Введите число");
            return;
        }

        Meal meal = new Meal(name, kkal);
        meals.add(meal);
        System.out.println("Блюдо успешно добавлено!");
    }

    public void removeLastMeal(){
        if(!meals.isEmpty()){
            meals.remove(meals.size() - 1);
        }else{
            System.out.println("Вы ничего не ели");
        }
    }

    public void mealsList(){

        if(meals.isEmpty()){
            System.out.println("Вы не ели");
        }else{
            int totalKkal = 0;

            for (Meal meal : meals) {
                System.out.println(meal.toString());
                totalKkal += meal.getKkal();
            }

            System.out.println();
            System.out.println("Общий ккал: " + totalKkal);
            System.out.println();
            System.out.println();
        }
    }

}
