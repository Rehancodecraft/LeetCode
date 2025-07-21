public class Solution{
	public static void main(String[] args){
	}
	public static int[] searchRange(int[] nums, int target){
		int ans = new int[1];
		int start = search(nums,target,true);
		int end = search(nums,target,false);
		ans[0] = start;
		ans[1] = end;
		return ans;
	}
	public static int search(int[] nums,int target, boolean isfirst){
	        int ans = -1;
		int start = 0;
		int end = nums.length - 1;

		while(start <= end){
			int mid = start + (end - start)/2;
			if(target > start){
				start = mid + 1;
			}else{
				ans = mid;
				if(isfirst){
					end = mid - 1;
				}else{
					start = mid + 1;
				}
			}
		}
		return ans
	}
}
