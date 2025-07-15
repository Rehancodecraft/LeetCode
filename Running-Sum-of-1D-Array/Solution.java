public class Solution {
    public static void main(String[] args) {
             int[] nums = {1,1,1,1,1};
            int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] runningSum(int[] nums) {
        int[] array = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(i > 0){
                    array[i] = array[i-1] + nums[i];
            }else{
                array[i] = nums[i];
            }
        }
        return array;
    }
}