package Leetcode.june;

public class ComplementofBase10Integer1009 {
    public int bitwiseComplement(int n) {
        char[] arr = Integer.toBinaryString(n).toCharArray();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '1'){
                arr[i] = '0';
            }else{
                arr[i] = '1';
            }
        }

        return Integer.parseInt(new String(arr), 2);
    }
}
