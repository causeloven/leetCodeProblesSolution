package Leetcode.june;

import java.util.*;
import java.util.stream.Stream;

public class LetterCombinationsofaPhoneNumber17 {
    public List<String> letterCombinations(String digits) {

        if(digits.trim().isEmpty()) return new ArrayList<>();

        Map<Character, String> phone = new HashMap<>();
        phone.put('2',"abc");
        phone.put('3',"def");
        phone.put('4',"ghi");
        phone.put('5',"jkl");
        phone.put('6',"mno");
        phone.put('7',"pqrs");
        phone.put('8',"tuv");
        phone.put('9',"wxyz");

        List<String> result = new ArrayList<>();
        result.add("");

        for(char digit : digits.toCharArray()){
            String letters = phone.get(digit);
            List<String> newResult = new ArrayList<>();

            for(String combination : result){
                for(char letter : letters.toCharArray()){
                    newResult.add(combination + letter);
                }
            }
            result = newResult;
        }

        return result;

    }

}
