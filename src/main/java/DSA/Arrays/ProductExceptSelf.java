package DSA.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int product =1;
        int count =0;
        boolean flag= false;
        int result[] = new int[nums.length];
        for(int i : nums)
        {
            if(i!=0){
                product*=i;
                count++;
            }
            else {
                flag = true;
            }
        }
        for(int j =0; j<nums.length; j++)
        {
            if(nums[j]==0 && count >0)
            {
                result[j]=product;
            }
            else {
                if(!flag)
                    result[j] = product/nums[j];
                else
                    result[j] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int result[] = productExceptSelf(new int[]{0,4,0});
        for(int i: result)
            System.out.println(i);
    }
}
