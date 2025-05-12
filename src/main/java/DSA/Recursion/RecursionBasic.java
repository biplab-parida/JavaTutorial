package DSA.Recursion;

public class RecursionBasic {
    public static void main(String[] args) {
//        printNTo1(5);
//        print1ToN(1,5);
//        print1ToNBackTracking(5);
        printNTo1BackTracking(5,1);
    }

    public static void printNTo1(int n)
    {
        if(n<=0)
            return;
        System.out.println(n);
        printNTo1(n-1);
    }
    public static void print1ToN(int i, int n)
    {
        if(i>n)
            return;
        System.out.println(i);
        print1ToN(i+1,n);
    }
    public static void print1ToNBackTracking( int n)
    {
        if(n==0)
            return;
        print1ToNBackTracking(n-1);
        System.out.println(n);
    }
    public static void printNTo1BackTracking( int n, int i)
    {
        if(n==0)
            return;
        printNTo1BackTracking(n-1,i+1);
        System.out.println(i);
    }
}
