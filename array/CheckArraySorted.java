package array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {23, 3, 45, 56, 234};

        boolean sorted = true;

        for (int i = 0; i < nums.length - 1; i++) {

            sorted = false;
            break;
        }

        if (sorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }
}