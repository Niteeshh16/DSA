package array;

public class LemonadeChange {

    static boolean change(int[] bills) {

        int five = 0;
        int ten = 0;

        for (int n : bills) {
            if (n == 5) {
                five++;
            } else if (n == 10) {
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else if (n == 20) {
                if (ten >= 1 && five >= 1) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    static void main() {
        int[] bills = {5, 20, 5, 10, 20};
        System.out.println(change(bills));
    }
}