package Leetcode.july04;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence1455 {
    public int isPrefixOfWord(String sentence, String searchWord) {

        int i = 1;

        for(String s : sentence.split(" ")){
            if(s.startsWith(searchWord)){
                return i;
            }
            i++;
        }

        return -1;
    }
}
