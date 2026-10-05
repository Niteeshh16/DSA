

//leetcode 643

package array;

public class MaximumAverageSubarray1 {

    static double findAverage(int[] nums, int k) {

        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i <= nums.length - k; i++) {

            double sum = 0;

            for (int j = i; j < i + k; j++) {
                sum += nums[j];
            }

            max = Math.max(max, sum);
        }

        return max / k;
    }


    static void main() {
        int[] nums =  {1,12,-5,-6,50,3};
        int k  = 4;
        System.out.println(findAverage(nums,k));

    }
}
