package Leetcode.june;

public class ReversePrefixofWord2000 {
    public String reversePrefix(String word, char ch) {
//        Input: word = "abcdefd", ch = "d"
//        Output: "dcbaefd
        int index = 0;
        for(int i = 0; i < word.length();i++){
            if(word.charAt(i) == ch){
                index = i;
                break;
            }
        }

        char[] answer = word.toCharArray();
        int left = 0, right = index;
        while (left < right){
            char temp = answer[left];
            answer[left] = answer[right];
            answer[right] = temp;
            left++;
            right--;
        }
        return new String(answer);
    }
}
