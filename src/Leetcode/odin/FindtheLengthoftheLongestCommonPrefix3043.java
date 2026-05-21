package Leetcode.odin;

import java.util.HashSet;

class Main{
    public static void main(String[] args){
    }
}


class FindtheLengthoftheLongestCommonPrefix3043 {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<String> hashSet = new HashSet<>();

        for(int i = 0; i < arr1.length; i++){

            String s = Integer.toString(arr1[i]);
            int k = s.length();

            for(int j = 1; j <= k; j++){

                hashSet.add(s.substring(0,j));

            }
        }

        int maxLenght = 0;

        for(int i = 0; i < arr2.length; i++){

            String s = Integer.toString(arr2[i]);
            int k = s.length();

            for(int j = 1; j <= k; j++){
                if(hashSet.contains(s.substring(0,j))){
                    String curr = s.substring(0,j);
                    if(curr.length() > maxLenght){
                        maxLenght = curr.length();
                    }
                }
            }
        }

        return maxLenght;
    }
}
