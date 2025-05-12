package DSA.TwoPointers;

public class LongestSubArrayWithGivenSum {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,2,1,2,1},3));
    }
    public static int subarraySum(int[] nums, int k) {
    int left=0,right=0,max=0,sum=0;
    while(left<nums.length && right<nums.length)
    {
        sum += nums[right];
        if(sum>=k)
        {

            if(sum==k){
                max=Math.max(max,right-left+1);
            }
            sum-=nums[left];
            left++;
            right++;
        }
        else{
            right++;
        }
    }

    return max;
    }


}
