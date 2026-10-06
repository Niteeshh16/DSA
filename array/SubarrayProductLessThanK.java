package array;

public class SubarrayProductLessThanK {

    static void find(int[] nums, int k) {

        int curProd = 1;
        int count = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            curProd *= nums[right];

            while (curProd >= k) {
                curProd /= nums[left];
                left++;
            }

            for (int i = left; i <= right; i++) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        int[] nums = {10, 5, 2, 6};
        int k = 100;

        find(nums, k);
    }
}