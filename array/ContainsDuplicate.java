package array;

import java.util.HashSet;

public class ContainsDuplicate {

    static void find(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                duplicates.add(num);
            }

            set.add(num);
        }

        System.out.println(duplicates);
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 32, 3, 32, 1};

        find(nums);
    }
}