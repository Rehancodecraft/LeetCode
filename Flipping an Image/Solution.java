
public class Solution {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(image);


    }

    public static int[][] flipAndInvertImage(int[][] image) {
            int[][] flippedArray = new int[image.length][image.length];
            for(int i = 0;i < image.length; i++){

                for(int j = 0;j < image.length; j++){

                    flippedArray[i][j] = image[i][(image.length-1)-j];
                    if(flippedArray[i][j] == 0){
                        flippedArray[i][j] = 1;
                    }else{
                        flippedArray[i][j] = 0;
                    }
                }
            }
            return flippedArray;
    }
}