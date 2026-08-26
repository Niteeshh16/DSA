package array;

public class MoveAllZerosToEnd {


    static void main() {
        int[] nums = {23,0,0,4,12};

        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length){
            nums[index] = 0;
            index++;
        }

        for (int num : nums){
            System.out.print(num + " ");
        }

    }
}
