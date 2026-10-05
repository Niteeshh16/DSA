package array;

public class BestTImeToBuyAndSellStocks {

    static int find(int[] nums){
        int minPrice = nums[0];
        int maxProfit = 0;

        for (int num : nums){
            if(num < minPrice){
                minPrice = num;
            }else {
                maxProfit= Math.max(maxProfit, num-minPrice);
            }

        }
        return maxProfit;

    }



    static void main() {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(find(nums));

    }
}
