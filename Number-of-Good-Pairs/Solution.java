
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};;
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1 ;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}