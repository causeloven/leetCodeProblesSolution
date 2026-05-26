package foodTracker;

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
