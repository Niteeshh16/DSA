package array;

public class RemoveDuplicate {
    static void main() {
        int[] nums = {12,2,34,12,34,13};

        int counter =0;
        for (int i = 0; i < nums.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < counter; j++) {

                if (nums[i] == nums[j]){
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate){
                nums[counter] = nums[i];
                counter++;
            }

        }
        for (int i = 0; i < counter; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
