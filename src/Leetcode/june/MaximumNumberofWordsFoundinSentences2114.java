package Leetcode.june;

public class MaximumNumberofWordsFoundinSentences2114 {
    public int mostWordsFound(String[] sentences) {

        int ans = 0;

        for(String s : sentences){
            String[] arr = s.split(" ");
            if(ans < arr.length){
                ans = arr.length;
            }
        }

        return ans;

    }

}
