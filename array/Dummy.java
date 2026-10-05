package array;

public class Dummy {

    static void find(int[] nums){

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

          if (nums[i] != 0){
              nums[k] = nums[i];
              k++;
          }
          while (nums[k] < nums.length){
              nums[k] = 0;
              k++;
          }
        }


    }

    static void main() {
        int[] nums = {2,0,0,4,1};
        find(nums);
    }
}
