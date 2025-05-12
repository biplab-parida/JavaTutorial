package DSA.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {13,45,89,1,25};
        selectionSort(a);
        Arrays.stream(a).forEach(System.out::println);
    }

    public static void selectionSort(int a[])
    {
        for(int i=0; i<a.length-1;i++)
        {
            int minIndex = i;
            for(int j=i;j<a.length ;j++)
            {
                if(a[j]<a[minIndex]) //Find minimum index
                {
                    minIndex=j;
                }
            }
            //Swap minimum index to bring it to ith position
            //after each round smallest element should come to ith position
            int temp=a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }
}
