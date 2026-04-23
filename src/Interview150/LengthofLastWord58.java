package Interview150;

public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {

        int wordLength = 0;
        char stopSymbal = ' ';
        int index = s.length() - 1;

        while(s.charAt(index) == stopSymbal && index >= 0){
            index--;
        }

        while(s.charAt(index) != stopSymbal && index >= 0){
            index--;
            wordLength++;
        }

        return wordLength;
    }
}

