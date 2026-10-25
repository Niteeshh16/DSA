package array;

public class MinimumSwapstoMoveZerostoEnd {

    static void find(int[] nums) {

        int zeroIndex = 0;
        int swaps = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                if (i != zeroIndex) {
                    int temp = nums[i];
                    nums[i] = nums[zeroIndex];
                    nums[zeroIndex] = temp;

                    swaps++;
                }

                zeroIndex++;
            }
        }

        System.out.println("Minimum swaps: " + swaps);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        find(nums);
    }
}