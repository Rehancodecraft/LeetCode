
import java.util.Arrays;

public class Solution{
    public static void main(String[] args){
        int[] input = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(input,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] + nums[i+1] == target){
                result[0] = i;
                result[1] = i +1;
            }
        }
        return result;
    }
}