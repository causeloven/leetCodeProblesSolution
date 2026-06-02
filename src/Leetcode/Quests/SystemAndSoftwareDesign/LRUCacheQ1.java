package Leetcode.Quests.SystemAndSoftwareDesign;

import javax.swing.plaf.nimbus.NimbusStyle;
import java.util.HashMap;

public class LRUCacheQ1 {
}

class Node{
    int key;
    int value;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    private Node tail;
    private Node head;
    private int capacity;
    private HashMap<Integer,Node> map;

    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        tail= new Node(-1,-1);
        head = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            removeNode(node);
            addToTale(node);

            return node.value;
        }else {
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            removeNode(node);
            addToTale(node);
        }else {
            Node newNode = new Node(key,value);
            map.put(key,newNode);
            addToTale(newNode);

            if(map.size() > capacity){
                Node lru = head.next;
                removeNode(lru);
                map.remove(lru.key);
            }
        }

    }

    private void addToTale(Node node){
        node.prev = tail.prev;
        node.next = tail;

        tail.prev.next = node;
        tail.prev = node;
    }

    private void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
}
