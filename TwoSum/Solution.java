
import java.util.Arrays;

public class Solution{
    public static void main(String[] args){
        int[] input = {2,5,5,11};
        int target = 10;
        int[] result = twoSum(input,target);
        System.out.println(Arrays.toString(result));

    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length-1; i++){
            int j = i+1;
            while(nums[i] + nums[j] != target){
                j++;
            }
                result[0] = i;
                result[1] = j;
            }
            return result;
        }
    }