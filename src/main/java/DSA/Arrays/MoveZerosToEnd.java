package DSA.Arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int a[] = new int[]{ 1,2,3,0,5};
        moveToEnd(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static int[] moveToEnd(int a[])
    {
        int i=0,j=0;
        while(j<a.length)
        {

            if(a[j]!=0){
                if(i!=j) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }
                i++;
            }
            j++;

        }
        return a;
    }
}
