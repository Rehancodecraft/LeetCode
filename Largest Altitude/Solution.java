
public class Solution {
    public static void main(String[] args) {
       int[] array = {-5,1,5,0,-7};
        System.out.println(largestAltitude(array));


    }

    public static  int largestAltitude(int[] gain) {
        int[] array = new int[gain.length + 1];
        array[0] =  0;
        int max = 0;
        for(int i = 1;i < array.length;i++){
            array[i] = array[i-1] + gain[i-1];
            if(max < array[i]){
                max = array[i];
            }
        }

    return max;

    }
}