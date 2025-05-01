package DSA.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j-1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}
//Few conditions needs to be added to avoid duplicates
//-1,0,1,2,-1,-4 continue part added for this case
// This condition increases value of i when num[i] is same as previos
//[0,0,0,0] while condition added for this case
// icreases j by 1 till nums[j] is not same