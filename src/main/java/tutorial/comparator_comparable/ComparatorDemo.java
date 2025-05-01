package tutorial.comparator_comparable;

import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {
//        demo1(); // This sorts the List in natural / ascending order
//        sortBasedOnLastDigit();
        sortDescending();
    }

    public static void demo1()
    {
        List<Integer> nums = new ArrayList<>(); //it is not compulsory to mention the generic type on the right-hand side if you have already mentioned it on the left-hand side.
        nums.add(45);
        nums.add(21);
        nums.add(34);
        nums.add(97);
        nums.add(12);
        Collections.sort(nums);
        System.out.println(nums);
    }
    public static void sortBasedOnLastDigit()
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(45);
        nums.add(21);
        nums.add(34);
        nums.add(97);
        nums.add(12);

        List<Integer> nums1 = nums;
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10)
                    return 1;
                else if(o1<o2)
                    return -1;
                else
                    return 0;
            }
        };

        Collections.sort(nums,com);
        System.out.println(nums);

    }

    public static void sortDescending()
    {
        List<Integer> nums = Arrays.asList(12,15,67,3,34);

        Collections.sort(nums,(a,b)->b-a);  //using lambda function
        Collections.sort(nums,Collections.reverseOrder()); // Same as above
        System.out.println(nums);

        nums.sort(Collections.reverseOrder());  //Mordern way
        System.out.println(nums);
        nums.sort(Integer::compareTo); //For natural sorting
        nums.sort(null); // same as above, can pass null for natural sorting
        System.out.println(nums);
    }
}
