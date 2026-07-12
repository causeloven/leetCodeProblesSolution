package Leetcode.july04;

import java.util.Stack;

public class ValidateStackSequences946 {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;

        for(int x : pushed){
            stack.push(x);
            while(!stack.isEmpty() && stack.peek() == popped[i]){
                stack.pop();
                i++;
            }
        }

        return i == popped.length;
    }
}
