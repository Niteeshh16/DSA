package array;

public class FindPivotIndex {

    static int find(int[] nums) {

        int[] prefix = new int[nums.length + 1];

        // Create prefix sum array
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        // Print prefix array
        for (int num : prefix) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Print left sums
        for (int i = 0; i < nums.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        System.out.println();

        // Print right sums
        for (int i = 0; i < nums.length; i++) {
            System.out.print(prefix[nums.length] - prefix[i+1] + " ");
        }

        System.out.println();

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {

            int leftSum = prefix[i];

            int rightSum = prefix[nums.length] - prefix[i + 1];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 7, 3, 6, 5, 6};

        System.out.println("Pivot Index: " + find(nums));
    }
}