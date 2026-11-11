package hashmap;

import java.util.HashMap;

public class FrequenceCount {



    static void find (int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map. getOrDefault(num, 0) +1);
        }

        for (int key : map.keySet()) {
            System.out.println(key + " appears " + map.get(key) + " times");
        }
    }


    static void main() {
        int[] nums = {1,2,4,1,2,4,23};
    }
}
