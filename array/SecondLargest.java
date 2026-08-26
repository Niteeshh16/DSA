package array;

public class SecondLargest {


    static void main() {

        int[] nums = {23,2,34,35,56,67};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length ; i++) {

          if (nums[i] > first){
              second = first;
              first = nums[i];
          }
          else if (nums[i] > second &&  nums[i] != first) {
              second = nums[i];
          }
        }
        System.out.println(second);

    }



}
