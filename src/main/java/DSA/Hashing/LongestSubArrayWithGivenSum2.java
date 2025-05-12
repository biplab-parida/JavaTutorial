package DSA.Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum2 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{2,3,-2,1,9,-3},10));
    }
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm =new HashMap<>();
        int sum=0,max=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length; i++){

            sum+=nums[i];
            if(hm.containsKey(sum-k))
            {
                max=Math.max(max,i-hm.get(sum-k));
            }
            // Store first occurrence of this sum
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
//            hm.put(sum,i);
        }
    return max;
    }
}
