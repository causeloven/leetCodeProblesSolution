package Interview150;

import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberofOccurrences1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        Set<Integer> set = new HashSet<>(map.values());

        if(set.size() == map.size()){
            return true;
        }else {
            return false;
        }
    }
}
