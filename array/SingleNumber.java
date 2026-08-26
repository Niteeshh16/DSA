package array;

import java.util.HashSet;

public class SingleNumber {
    static void main() {
        int[] nums = {12,23,12,23,1,14};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums){
            if (set.contains(num)){
                set.remove(num);
            }else{
                set.add(num);
            }
        }
        System.out.println(set);
    }
}
