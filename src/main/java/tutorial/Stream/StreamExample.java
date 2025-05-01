package tutorial.Stream;

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0)
                sum += a[i];
        }
        //Instead of above lines this can be done in a single line

        int sum2 = Arrays.stream(a).filter(n->n%2==0).sum();
        System.out.println(sum2);
    }
}
