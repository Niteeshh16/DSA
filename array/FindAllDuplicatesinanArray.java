package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindAllDuplicatesinanArray {

    static List<Integer> findDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            // Check whether the number already exists
            if (set.contains(num)) {
                list.add(num);
            } else {
                // Add the number if it doesn't exist
                set.add(num);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDuplicate(nums));
    }
}