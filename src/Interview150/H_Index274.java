package Interview150;

import java.util.Arrays;

public class H_Index274 {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            if(citations[i] >= citations.length - i){
                return citations.length - i;
            }

        }

        return 0;
    }
}
