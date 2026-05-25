package Leetcode.May;

import java.util.Arrays;

public class MyHashMap {

    int[] array = new int[(10*10*10*10*10*10)+1];


    public MyHashMap() {
        Arrays.fill(this.array, -1);
    }

    public void put(int key, int value) {
        array[key] = value;
    }

    public int get(int key) {
        return array[key];
    }

    public void remove(int key) {
        array[key] = -1;
    }
}