package DSA.Recursion;

import java.util.Arrays;

public class Recursion2 {
    public static void main(String[] args) {
//        System.out.println(sum(1));
        int a[] = new int[] {1,2,5,6,7};
        reverseArray(a,0,4);
        Arrays.stream(a).forEach(System.out::println);
        String s="MadaM";
        System.out.println(checkPalindrome(s,0,s.length()-1));
    }

    public static int sum(int n) {
        if (n == 0)
            return 0; //return 1 in case of factorial
        return n + sum(n - 1);
        //f(5) = 5+f(4) = 5+4+f(3) ...

    }

    public static void reverseArray(int []a,int l, int r)
    {
        if(l>=r)
            return;
        int temp = a[l];
        a[l]=a[r];
        a[r]=temp;
        reverseArray(a,l+1,r-1);

    }

    public static boolean checkPalindrome(String s, int l, int r){
        if(l>=r)
            return true;
//        boolean flag=true;
        if(s.charAt(l) != s.charAt(r))
            return false;
        return checkPalindrome(s,l+1,r-1);
    }
}
