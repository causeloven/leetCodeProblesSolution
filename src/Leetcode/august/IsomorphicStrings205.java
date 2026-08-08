package Leetcode.august;

public class IsomorphicStrings205 {
    public boolean isIsomorphic(String s, String t) {
        int[] sChars = new int[256];
        int[] tChars = new int[256];

        for(int i = 0; i < 256; i++){
            sChars[i] = -1;
            tChars[i] = -1;
        }

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sChars[sChar] == -1 && tChars[tChar] == -1){
                sChars[sChar] = tChar;
                tChars[tChar] = sChar;
            } else if (sChars[sChar] !=  tChar || tChars[tChar] != sChar) {
                return false;
            }
        }

        return true;
    }
}
