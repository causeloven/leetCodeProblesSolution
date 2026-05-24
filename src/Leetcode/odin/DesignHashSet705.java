package Leetcode.odin;

public class DesignHashSet705 {
}

class MyHashSet {
    boolean[] booleans = new boolean[(int) (Math.pow(10,6)+1)];

    public MyHashSet() {

    }

    public void add(int key) {
        booleans[key] = true;
    }

    public void remove(int key) {
        booleans[key] = false;
    }

    public boolean contains(int key) {
        return booleans[key];
    }
}
