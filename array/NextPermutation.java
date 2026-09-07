package array;

public class NextPermutation {

    public void nextPermutation(int[] nums) {

        // Step 1: Find the first decreasing element from right
        int i;

        for (i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                break;
            }
        }

        System.out.println("i = " + i);
        System.out.println("Value = " + nums[i]);

        // Step 2: Find the element greater than nums[i]
        if (i >= 0) {

            int j;

            for (j = nums.length - 1; j > i; j--) {
                if (nums[j] > nums[i]) {
                    break;
                }
            }

            System.out.println("j = " + j);
            System.out.println("Value = " + nums[j]);

            // Step 3: Swap nums[i] and nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Step 4: Reverse the elements after i
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }

        // Print final array
        System.out.print("Next Permutation: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        NextPermutation n = new NextPermutation();
        n.nextPermutation(nums);
    }
}