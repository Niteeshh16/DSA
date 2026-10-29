package seanprasadpatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

    static List<Integer> find(int[] nums) {

        Arrays.sort(nums);

        List<Integer> list = new ArrayList<>();

        int expected = 1;

        for (int num : nums) {

            if (num == expected) {
                expected++;
            }
            else if (num > expected) {

                while (expected < num) {
                    list.add(expected);
                    expected++;
                }

                expected++;
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = find(nums);

        System.out.println(result);
    }
}