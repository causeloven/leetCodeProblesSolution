package MyRPG;

public class Player {
    private int HP = 100; //стандартное значение
    private int damage = 10;
    private String name;

    public Player(String name){
        this.name = name;
    }

    public void printStats(){
        System.out.println("Характеристики "+name+": ");
        System.out.println("HP: " + HP + "\t\tУрон: " + damage);
        System.out.println();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}
