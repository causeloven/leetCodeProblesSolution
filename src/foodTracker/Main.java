package foodTracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        FoodEntryManager foodEntryManager = new FoodEntryManager();
        foodEntryManager.loadFromFile();

        boolean onProcess = true;
        Scanner scanner = new Scanner(System.in);
        String query;


        while(onProcess){


            System.out.println("1 - Добавить продукт");
            System.out.println("2 - Убрать продукт");
            System.out.println("3 - Выйти");
            System.out.print("Введите значение:");
            query = scanner.nextLine();

            int operation = 0;
            try{
                operation = Integer.parseInt(query);
            }catch (NumberFormatException e){
                System.out.println("Ошибка ввода операции");
            }

            if (operation == 0){
                continue;
            }else{
                switch (operation){
                    case(1):
                        //бля это по хорошему написать метод но мне так лень пока что
                        String date = scanner.nextLine();
                        String product = scanner.nextLine();
                        String calories = scanner.nextLine();
                        foodEntryManager.addEntry(date,product,calories);
                        break;
                    case (2):
                        String date1 = scanner.nextLine();
                        String product1 = scanner.nextLine();
                        String calories1 = scanner.nextLine();
                        foodEntryManager.removeEntry(date1,product1, Integer.parseInt(calories1));
                        break;
                    case (3):
                        foodEntryManager.saveToFile();
                        onProcess = false;
                        break;
                    default:
                        break;
                }
            }

        }

    }
}
