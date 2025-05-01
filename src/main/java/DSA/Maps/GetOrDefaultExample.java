package DSA.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GetOrDefaultExample {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(19, 12, 3, 34, 3, 18, 6, 19);
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("A", 1);
        hm1.put("B", 2);
        int test = hm1.getOrDefault("A", 0);
        System.out.println(test);
        int test2 = hm1.getOrDefault("C", 0);
        System.out.println(test2);

        //Frequency of elements
        for (int i : li) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        System.out.println(hm);
    }

}

