package array;

public class FindtheDistanceValueBetweenTwoArrays {

    static int find(int[] arr1, int[] arr2, int d){

        int result = 0;

        for (int i = 0; i < arr1.length; i++) {
            boolean valid = true;
            for (int j = 0; j < arr2.length; j++) {

                if (Math.abs(arr1[i] - arr2[j]) <= d){
                    valid = false;
                    break;

                }


            }
            if (valid) {
                result++;
            }


        }

        return result;

    }





    static void main() {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,9,1,8};
        int d = 2;
        ;
        System.out.println(find(arr1,arr2,d));
    }
}
