package contest;

public class contets500 {

    //Q1
    public int[] countOppositeParity(int[] nums) {
        int[] answer = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int counter = 0;
            //если число четное
            if(nums[i] % 2 == 0){
                for (int j = i+1; j < nums.length; j++){
                    if(nums[j] % 2 != 0){
                        counter++;
                    }
                }
            }else {
                for (int j = i+1; j < nums.length; j++){
                    if(nums[j] % 2 == 0){
                        counter++;
                    }
                }
            }
            answer[i] = counter;
        }

        return answer;
    }

    //Q2
    public int sumOfPrimesInRange(int n) {
        //простое число делиться только на один и на себя
        int temp = n;
        int r = 0;

        while( temp > 0){
            r = r * 10  + (temp % 10);
            temp /= 10;
        }

        int min = Math.min(n,r);
        int max = Math.max(n,r);

        int sum = 0;

        for(int i = min; i <= max; i++){
            if(goodDigit(i)){
                sum+=i;
            }
        }
        return sum;
    }

    private boolean goodDigit(int num){
        if(num <= 1) return false;
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; i*i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
