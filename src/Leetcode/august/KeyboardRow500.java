package Leetcode.august;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow500 {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List<String> result = new ArrayList<>();

        for(String word : words){
            String lower = word.toLowerCase();
            boolean inRow1 = true, inRow2 = true, inRow3 = true;

            for(char c : lower.toCharArray()){
                if(row1.indexOf(c) == -1) inRow1 = false;
                if(row2.indexOf(c) == -1) inRow2 = false;
                if(row3.indexOf(c) == -1) inRow3 = false;
            }

            if(inRow1 || inRow2 || inRow3){
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
