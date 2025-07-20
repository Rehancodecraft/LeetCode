
public class Solution{
    public static void main(String[] args){

    }
    public static int floorofnumber(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target > mid){
                start = mid + 1;
            }else if (target<mid){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return end;

    }
     public static int ceilingofNumber(int[] array, int target){
        int start = 0;
        int end = array.length -1;
        if(target > array.length-1){
            return -1;
        }
        while(start<= end){
            int mid = start + (end-start)/2;
            if(target > mid){
                start = mid + 1;
            }else if (target<mid){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return start;

    }
}