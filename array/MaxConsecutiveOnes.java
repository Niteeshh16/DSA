package array;

public class MaxConsecutiveOnes {
    static void main() {
        int[] nums = {1,1,0,0,1,1,1,1,1,};
        int counter = 0;
        int max = 0;
        for (int i  = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                counter++;
                max = Math.max(max, counter);

            }else {
                counter = 0;
            }
        }
        System.out.println(max);
    }
}
