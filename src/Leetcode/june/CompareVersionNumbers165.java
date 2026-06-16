package Leetcode.june;

public class CompareVersionNumbers165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int[] vI = new int[v1.length];
        int[] vII = new int[v2.length];

        for(int i = 0; i < v1.length; i++){
            vI[i] = Integer.parseInt(v1[i]);
        }
        for(int i = 0; i < v2.length; i++){
            vII[i] = Integer.parseInt(v2[i]);
        }

        int i = 0;
        while(i < vI.length || i < vII.length){
            int num1 = i < vI.length ? vI[i] : 0;
            int num2 = i < vII.length ? vII[i] : 0;
            if(num1 != num2){
                return num1 < num2 ? -1 : 1;
            }
            i++;
        }

        return 0;
    }
}
