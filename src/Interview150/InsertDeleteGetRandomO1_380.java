package Interview150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class InsertDeleteGetRandomO1_380 {

    List<Integer> num = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    Random random = new Random();

    public InsertDeleteGetRandomO1_380() {

    }

    public boolean insert(int val) {
        if( map.containsKey(val)){
            return false;
        } else {
            num.add(val);
            map.put(val,num.size()-1);
            return true;
        }

    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }else {
            int index = map.get(val);
            int lastElement = num.get(num.size()-1);

            num.set(index,lastElement);
            map.put(lastElement, index);

            num.remove(num.size()-1);
            map.remove(val);

            return true;
        }
    }

    public int getRandom() {
        return num.get(random.nextInt(num.size()));
    }

}
