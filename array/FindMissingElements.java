package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {



    static List<Integer> findMissingElement(int[] nums){

        Arrays.sort(nums);


        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {

            int current = nums[i];
            int next = nums[i+1];

            for (int j  = current+1; j < next; j++){
                result.add(j);
            }




        }


        return result;
    }

    static void main() {
        int[] nums = {2,7,6,5,3};
        System.out.println(  findMissingElement(nums));
    }
}
