package Leetcode.Collections.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();

        // 0(N)
        char[] sArr = s.toCharArray();

        // O(N)
        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == '(' ||sArr[i] == '[' ||sArr[i] == '{'){
                //O(1)
                stack.push(sArr[i]);
            }else {
                //O(1)
                if(stack.isEmpty()){
                    return false;
                }else{

                    char currentChar = stack.pop();
                    if(currentChar == '(' && sArr[i] != ')'){return false;}
                    if(currentChar == '[' && sArr[i] != ']'){return false;}
                    if(currentChar == '{' && sArr[i] != '}'){return false;}

                }
            }
        }
        //O(1)
        return stack.isEmpty();
    }
}
