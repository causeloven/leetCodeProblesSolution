package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses20 {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0){
            return false;
        }

        Deque<Character> stack = new ArrayDeque<>();
        char[] sArr = s.toCharArray();

        for(int i = 0; i < sArr.length; i++){
            if(sArr[i] == '(' ||sArr[i] == '[' ||sArr[i] == '{'){
                stack.push(sArr[i]);
            }else {
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
        return stack.isEmpty();
    }
}
