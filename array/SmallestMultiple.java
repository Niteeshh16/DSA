//leetcode 3718






package array;

import java.util.HashSet;

public class SmallestMultiple {



    static int find(int[] nums, int k){


        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int multiple = k;

        while (set.contains(multiple)){
            multiple += k;
        }


        return multiple;
    }

    static void main() {
        int nums[] = {8, 2, 3, 4, 6};
        int k = 2;

        System.out.println(find(nums,k));
    }
}
