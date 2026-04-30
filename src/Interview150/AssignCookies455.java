package Interview150;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AssignCookies455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;

        while(child < g.length && cookie < s.length){
            if(s[cookie] >= g[child]){
                child++;
            }
            cookie++;
        }

        return child;
    }
}
