import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] result = createTargetArray(nums,index);
        System.out.println(Arrays.toString(result));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            for(int j = nums.length-2;j >= index[i];j--){
                target[j+1] = target[j];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }
}