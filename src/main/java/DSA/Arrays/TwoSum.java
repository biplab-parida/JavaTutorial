package DSA.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (hm.containsKey(compliment) && hm.get(compliment) != i)
                return new int[]{i, hm.get(compliment)};
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 4};
        int results[] = twoSum(nums, 6);
        if (results.length >= 2)
            System.out.println(results[0] + "   " + results[1]);
        else
            System.out.println("No Results");
    }
}
