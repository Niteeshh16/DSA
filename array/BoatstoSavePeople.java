package array;

import java.util.Arrays;

public class BoatstoSavePeople {


    static void find(int[] people, int limit) {

        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boat = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                left++;
            }

            right--;
            boat++;
        }

        System.out.println(boat);
    }

    static void main() {
        int[] people = {3,2,2,1};
        int limit = 3;
        find(people,limit);
    }
}
