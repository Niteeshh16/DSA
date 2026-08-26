package sorting;

public class SelectionSort {
    static void main() {
        int[] nums = {23,12,34,11,25,23};

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if (nums[i] > nums[j]){


                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                
            }

            }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");


        }
    }
}
