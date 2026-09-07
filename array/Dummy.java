package array;

public class Dummy {

    static void find(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    System.out.println(nums[j]);
                }
            }

        }


    }

    static void main() {
        int[] nums = {2,1,3,4,1};
        find(nums);
    }
}
