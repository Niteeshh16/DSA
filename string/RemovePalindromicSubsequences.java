package string;

public class RemovePalindromicSubsequences {


    static void find(String s){

        int left = 0;
        int right = s.length()-1;


        while (left < right){
            if (s.charAt(left)!= s.charAt(right)){
                System.out.println(2);
            }
            left++;
            right--;
        }
        System.out.println(1);
    }




    static void main() {
        String s = "baabb";
        find(s);
    }
}
