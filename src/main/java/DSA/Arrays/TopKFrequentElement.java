package DSA.Arrays;

import java.util.*;


public  class TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        int r[] ;
        List<Integer>[] li= new List[nums.length+1];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {

            hm.put(i, hm.getOrDefault(i,0) + 1);
        }
        //hm will have num and its frequency
        System.out.println(hm);
       HashMap<Integer, ArrayList<Integer>>  hm2 = new HashMap<>();
       ArrayList<Integer> lis ;
       for(int key : hm.keySet() ) {
           int val = hm.get(key);
           if(!hm2.containsKey(val))
           {
               lis=new ArrayList<>();
               lis.add(key);
               hm2.put(val,lis);
           }
           else {
               lis = hm2.get(val);
               lis.add(key);
               hm2.put(val,lis);
           }
       }
        System.out.println(hm2);
       ArrayList<Integer> finalList = new ArrayList<>();
        int count = 0;
        for(int i= nums.length; i>0;i--){
            if(hm2.get(i)!=null) {
                for (int num : hm2.get(i)) {
                    if (count < k) {
                        finalList.add(num);
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }
        System.out.println(finalList);
       r= new int[finalList.size()];
        for(int f = 0; f<finalList.size(); f++)
        {
            r[f]= finalList.get(f);
        }
        return r;
    }


    public static void main(String[] args) {
        int nums[] = {4,1,-1,2,-1,2,3};
        int result [] = topKFrequent(nums, 2);
        for(int i=0;i<result.length ; i++)
            System.out.println(result[i]);
    }
}