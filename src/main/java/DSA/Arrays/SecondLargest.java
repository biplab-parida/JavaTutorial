package DSA.Arrays;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int a[] ={10,-9};
        System.out.println(secondLargest(a));
    }

    public static int secondLargest(int []a)
    {
        int max = Integer.MIN_VALUE, max2= Integer.MIN_VALUE ;

        for(int i : a)
        {
            if(i>max)
            {
                max=i;
            } else if (i>max2 && i!=max) {
                max2=i;
            }
        }
        if(max2!=Integer.MIN_VALUE)
            return max2;
        else
            return -1;
    }
}
