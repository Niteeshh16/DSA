package array;

public class Dummy {
    static void main() {
        int[] nums = {1,2,3,1};
        int k = 3;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
