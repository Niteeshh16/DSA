package array;

public class ContainsDuplicate2 {


    static boolean findDuplicate(int[] nums, int k){

        boolean result = false;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < k; j++){
                if (nums[i] == nums[j]){
                    result = true;
                }
            }
        }



        return result;
    }


    static void main() {
        int[] nums =  {1,2,3,1,2,3};
        int k = 2;
        System.out.println(findDuplicate(nums,k));
    }
}
