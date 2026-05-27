package foodTracker;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FoodEntryManager {

    private static final String DATA_FILE = "src/foodTracker/FoodListFile";

    private List<FoodEntry> foodEntryList = new ArrayList<>();

    public void loadFromFile(){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(DATA_FILE))) {

            String line;
            while((line = bufferedReader.readLine()) != null){

                if(line.trim().isEmpty()) continue;
                String[] parts = line.split(";");
                if(parts.length != 3) continue;

                try{
                    int ccals = Integer.parseInt(parts[2]);
                    foodEntryList.add(new FoodEntry(parts[0], parts[1], ccals));
                }catch (NumberFormatException ignored){
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void saveToFile(){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(DATA_FILE))) {

            for(int i = 0; i < foodEntryList.size(); i++){
                FoodEntry foodEntry = foodEntryList.get(i);
                bufferedWriter.write(foodEntry.toFileString());
                bufferedWriter.newLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public boolean addEntry(String date, String product, String calories){
        int ccal = 0;

        try{
            ccal = Integer.parseInt(calories);
        }catch (NumberFormatException e){
            System.out.println("Не удалось добавить продукт из за неправильных данных о ккал");
            return false;
        }

        FoodEntry foodEntry = new FoodEntry(date, product, ccal);

        foodEntryList.add(foodEntry);

        if(foodEntryList.size() % 5 == 0){
            saveToFile();
        }

        System.out.println("Успешно добавлено");
        return true;
    }

    public void removeEntry(String date, String product, int calories){
        FoodEntry foodEntry = new FoodEntry(date,product,calories);

        for(int i = 0; i < foodEntryList.size(); i++){
            if(foodEntryList.get(i).equals(foodEntry)){
                foodEntryList.remove(i);
                break;
            }
        }
    }

    public int getTotalCaloriesForDate(){
        return 0;
    }

    public List<FoodEntry> getEntriesForDate(String Date){
        return null;
    }

    public List<FoodEntry> getEntriesBetweenDates(String startDate, String endDate){
        return null;
    }
}
