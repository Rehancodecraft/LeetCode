
import java.util.Arrays;

public class Solution{
    public static void main(String[] args) {
        int[] array = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println(removeElement(array, val));
        
        
    }
    public static int removeElement(int[] nums, int val) {
        nums = removeDigits(nums, val);
        System.out.println(Arrays.toString(nums));
        int count = 0;
        return count;
    }
    public static int[] removeDigits(int[] array, int val){
        int[] nums = new int[10];
        for(int i = 0; i < array.length;i++){
            if(array[i] != val){
                nums[i] = array[i];
            }
        }
        return nums;
    }

}