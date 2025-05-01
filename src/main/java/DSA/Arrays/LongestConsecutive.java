package DSA.Arrays;

import java.util.*;

public class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer>  s=new HashSet<>();
        for(int k : nums)
        {
            s.add(k);
        }
        List<Integer> list = new ArrayList<>(s);
        Collections.sort(list);
        int max=-1, count=0;
        if(list.size()==0)
            return 0;
        for (int i =1; i<list.size(); i++)
        {
            if(list.get(i)- list.get(i-1) ==1 )
            {
                count++;
            }
            else
            {
                if(count+1>=max) {
                    max=count+1;
                }
                count=0;
            }
        }
        if(max==-1 && s.size()>1)
        {
            max=s.size();
        }
        if(count+1>max)
            max = count+1;
        return max;
    }

    public static void main(String[] args) {
        LongestConsecutive obj = new LongestConsecutive();
        System.out.println(obj.longestConsecutive(new int[]{7,-9,3,-6,3,5,3,6,-2,-5,8,6,-4,-6,-4,-4,5,-9,2,7,0,0}));

    }
}
//9,1,-3,2,4,8,3,-1,6,-2,-4,7

