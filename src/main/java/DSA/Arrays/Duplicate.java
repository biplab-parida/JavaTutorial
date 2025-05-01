package DSA.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Set<Integer> al = new HashSet<>(); //O(n)
        for (int i : nums) {
            if (!al.add(i)) {
                flag = true;
                break;
            }
        }

        return flag;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums); // O(n log n)
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true; // duplicate found
            }
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1};
        Duplicate d = new Duplicate();
        System.out.println(d.containsDuplicate(nums));
        System.out.println(d.containsDuplicate2(nums));
    }
}


