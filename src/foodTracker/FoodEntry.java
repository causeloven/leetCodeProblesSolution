package foodTracker;

import java.util.Objects;

public class FoodEntry {

    private String date;
    private String product;
    private int calories;

    public FoodEntry(String date, String product, int calories){
        this.date = date;
        this.product = product;
        this.calories = calories;
    }

    @Override
    public String toString(){
        return date + " | " + product + " | " + calories + " ккал";
    }

    public String toFileString(){
        return date + ";" + product + ";" + calories;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        FoodEntry other = (FoodEntry) obj;

        return calories == ((FoodEntry) obj).calories &&
                date.equals(((FoodEntry) obj).getDate()) &&
                product.equals(((FoodEntry) obj).getProduct());
    }

    @Override
    public int hashCode() {
        return Objects.hash(date,product,calories);
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
