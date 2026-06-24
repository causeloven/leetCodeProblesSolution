package Leetcode.june;

public class SortthePeople2418 {
    public String[] sortPeople(String[] names, int[] heights) {

        String[] result = new String[names.length];

        int count = 0;
        while(count < names.length){
            int highId = 0;
            for(int i = 0; i < heights.length; i++){
                if(heights[i] > heights[highId]){
                    highId = i;
                }
            }
            heights[highId] = 0;
            result[count] = names[highId];
            count++;
        }

        return result;


    }


}
