package array;

public class ReverseArray {
    static void main() {
        int[] nums = {12,34,123,3,43,32};
        int[] result = new int[nums.length];
        int j = 0;

        for (int i = nums.length-1; i >= 0; i--) {
            result[j] = nums[i];
            j++;
        }
        for (int n : result){
            System.out.print(n + " ");
        }
    }
}
