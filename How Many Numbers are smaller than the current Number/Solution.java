import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] array = new int[nums.length];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    count++;
                }
            }
            array[i] = count;
            count = 0;

        }
        return array;
    }
}