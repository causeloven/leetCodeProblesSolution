package HashMap;

import java.util.HashMap;

public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        //КЛЮЧ САМО ЧИСЛО, ИНДЕКС ЕГО МЕСТО В МАССИВЕ

        // O(N)
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            // O(1)
            //если содержит в себе ключ, а то есть нужно значение которое уже было помещено в коллекцию
            if(hashMap.containsKey(complement)){
                // O(1)
                //то мы вернем новый массив как ответ где
                //гет это индекс в массиве. то есть метод гет возвращает значение
                return new int[]{hashMap.get(complement), i};
            }
            // O(1)
            hashMap.put(nums[i], i);
        }

        return null;
        //сложность алгоритма О(N) из за for
    }
}
