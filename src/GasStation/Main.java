package GasStation;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(2);

    }
}

class MinStack {
    Deque<Integer> mainStack = new ArrayDeque<>();
    Deque<Integer> minStack = new ArrayDeque<>();

    public MinStack() {

    }

    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }else{
            int current = minStack.peek();
            if(current > val){
                minStack.push(val);
            }else {
                minStack.push(current);
            }
        }
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

