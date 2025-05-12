package DSA.Arrays;

import java.util.HashMap;

public class NumberAppearOnlyOnce {
    public static void main(String[] args) {
        int a[] = {1,1,0,2,0,2,3};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i< a.length;i++){
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }
        for(int j :hm.keySet())
        {
            if(hm.get(j)!=2){
                System.out.println(j);
            }
        }
    }
}
