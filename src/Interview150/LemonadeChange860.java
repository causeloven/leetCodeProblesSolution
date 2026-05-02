package Interview150;

public class LemonadeChange860 {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                five++;
            }else if(bills[i] == 10){
                ten++;
                five--;
                if(five < 0){
                    return false;
                }
            } else if (bills[i] == 20) {
                if(ten >= 1 && five >= 1){
                    five--;
                    ten--;
                }else{
                    five--;
                    five--;
                    five--;
                }

            }
        }

        return true;
    }
}
