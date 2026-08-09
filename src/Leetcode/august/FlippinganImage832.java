package Leetcode.august;

public class FlippinganImage832 {
    public int[][] flipAndInvertImage(int[][] image) {

        int n = image.length;

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = image[i][j];
                image[i][j] = image[i][image[i].length - 1 - j];
                image[i][image[i].length - 1 - j] = temp;
            }
        }

        for(int i = 0; i < image.length; i++){
            for(int j = 0; j < image[i].length; j++){
                image[i][j] = 1 - image[i][j];
            }
        }

        return image;
    }
}
