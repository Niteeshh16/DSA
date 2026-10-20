package array;

public class DefusetheBomb {

    static void make(int[] nums, int k){

        int[] result = new int[nums.length];


        int sum = 0;

        for (int i = 0; i < nums.length; i++){

            for (int j  = i+1; j < nums.length; j++){
                sum += nums[j];


                System.out.println(sum);

            }



        }
    }




    static void main() {
        int[] nums = {5,7,1,4};
        int k =3;
        make(nums,k);
    }
}
