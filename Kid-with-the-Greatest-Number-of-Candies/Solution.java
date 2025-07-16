import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(kidsWithCandies(nums, n));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int j = 0; j < candies.length; j++) {
            int result = candies[j] + extraCandies;
            if (result >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}