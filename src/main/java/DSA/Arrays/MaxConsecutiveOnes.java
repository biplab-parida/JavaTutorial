package DSA.Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(maxConsecutive(new int[]{0,1,1,0,1}));
        System.out.println(maxConsecutive(new int[]{1,1,0,1,1,1}));
        System.out.println(maxConsecutive(new int[]{1,0,1,1,0,1}));
    }

    public static int maxConsecutive(int a[])
    {
        int max=0,cnt=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1){
               cnt++;
            }
            else {
                cnt=0;
            }
            if(cnt>max){
                max=cnt;
            }
        }

        return max;
    }

    public static int maxConsecutive2(int a[])
    {
        int left = 0;
        int right = 0;
        int maxCount = 0;

        while (right < a.length) {
            if (a[right] == 1) {
                // Continue the streak
                right++;
                maxCount = Math.max(maxCount, right - left);
            } else {
                // Reset the streak
                right++;
                left = right;
            }
        }

        return maxCount;
    }
}

