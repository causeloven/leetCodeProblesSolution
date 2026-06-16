package Leetcode.june;

public class DetermineifStringHalvesAreAlike1704 {
    public boolean halvesAreAlike(String s) {
        int countA = 0;
        int countB = 0;

        String vowels = "aeiouAEIOU";

        for(int i = 0; i < s.length()/2; i++){
            if(vowels.indexOf(s.charAt(i)) != -1) countA++;
        }

        for(int i = s.length()/2; i < s.length(); i++){
            if(vowels.indexOf(s.charAt(i)) != -1) countB++;
        }

        return countA == countB;
    }
}
