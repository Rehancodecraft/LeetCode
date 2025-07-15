import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
            int[] nums = {0,2,1,5,3,4};
            int[] result = buildArray(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[nums[i]];
        }
        return array;
    }
}