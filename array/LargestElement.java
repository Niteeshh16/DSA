package array;

public class LargestElement {
    static void main() {
        int[] nums = {23,4,23,545,56,7};

        int largest = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest){
                largest = nums[i];
            }

        }

        System.out.println(largest);
    }
}
