package string;

public class ReverseOnlyLetters {


    static String find(String s){

        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;

        while (left < right){
            if (!Character.isLetter(arr[left])){
                left++;
            } else if (!Character.isLetter(arr[right])) {
                right--;
                
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);


    }



    static void main() {
        String s = "ab-cd";
        System.out.println(find(s));
    }
}
