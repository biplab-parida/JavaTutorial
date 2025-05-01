package DSA.Arrays;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<>();
        List<String> al ;
        HashMap<String,List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            char [] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);
            if(!hm.containsKey(sorted))
            {
                al=new ArrayList<>();
                al.add(strs[i]);
                hm.put(sorted,al);
            }
            else
            {
                al =hm.get(sorted);
                al.add(strs[i]);
                hm.put(sorted,al);
            }

        }
        for(String s : hm.keySet())
        {
            l.add(hm.get(s));
        }

        return l;
    }
    public static void main(String[] args) {
        String s[] = {"ate","eat","ab"};
        List<List<String>> l = groupAnagrams(s);
        System.out.println(l);
    }
}
