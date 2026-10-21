package linkedlist;

public class IsSubsequence {

    static boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();   // it will return true if hte lenght of the i is = to the s.length() that means i went till the last and found all matchings
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgd";

        boolean result = isSubsequence(s, t);

        System.out.println(result);
    }
}