import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
            int[] nums = {1,2,1};
            int[] result = getConcatenation(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getConcatenation(int[] nums) {
            int[] array = new int[2 * nums.length];
            for(int i = 0;i < nums.length;i++){
                array[i] = nums[i];
                array[i+nums.length] = nums[i];
            }
            return array;
    }
}