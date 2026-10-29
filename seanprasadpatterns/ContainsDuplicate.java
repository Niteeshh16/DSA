package seanprasadpatterns;

import java.util.HashSet;

public class ContainsDuplicate {

    // Brute Force
    // Time: O(n²)
    // Space: O(1)
    static void findBruteForce(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("True");
                    return;
                }
            }
        }

        System.out.println("False");
    }

    // Optimized using HashSet
    // Time: O(n) average
    // Space: O(n)
    static void findOptimized(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {

            if (set.contains(num)) {
                System.out.println("True");
                return;
            }

            set.add(num);
        }

        System.out.println("False");
    }

    static int[] removeDuplicate(int[] nums){

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]){
                    return new int[]{j};
                }
            }
        }
        return new int[]{};

    }


    static void main() {

        int[] nums = {234, 12, 12, 34, 12, 34};
/*
        System.out.println("Brute Force:");
        findBruteForce(nums);

        System.out.println("Optimized:");
        findOptimized(nums);*/


        System.out.println(removeDuplicate(nums));
    }
}