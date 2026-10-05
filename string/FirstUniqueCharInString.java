package string;

import java.util.HashMap;

public class FirstUniqueCharInString {
    static void main() {

        String s = "loveleetcode";
       // int result = 0;


        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) ==1){
                System.out.println(i);
                break;
            }

        }

    }



}
