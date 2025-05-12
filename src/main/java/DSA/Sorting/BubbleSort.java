package DSA.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] ={45,23,5,28,56};
        bubbleSort(a);
        Arrays.stream(a).forEach(System.out::println);
    }
    public static void bubbleSort(int a[])
    {
        for(int i=0; i<a.length; i++)
        {
            boolean swapped =false;

            for (int j=0;j<a.length; j++)
            {
                if(a[i]<a[j])
                {
                    int temp=a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    swapped=true;
                }
            }
            if(!swapped)
                break;
        }
    }
}
