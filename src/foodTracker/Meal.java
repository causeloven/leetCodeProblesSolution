package foodTracker;

public class Meal {

    private String nameOfMeal;
    private int kkal;

    public Meal(){
        this.nameOfMeal = "none";
        this.kkal = -1;
    }

    public Meal(String nameOfMeal, int kkal){
        this.nameOfMeal = nameOfMeal;
        this.kkal = kkal;
    }

    @Override
    public String toString(){
        return "Блюдо: "+ nameOfMeal + " / Ккал: " + kkal;
    }

    public String getNameOfMeal() {
        return nameOfMeal;
    }

    public void setNameOfMeal(String nameOfMeal) {
        this.nameOfMeal = nameOfMeal;
    }

    public int getKkal() {
        return kkal;
    }

    public void setKkal(int kkal) {
        this.kkal = kkal;
    }
}
