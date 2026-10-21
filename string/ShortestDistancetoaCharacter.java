package string;

public class ShortestDistancetoaCharacter {

    static void find(String s, char c) {

        int[] result = new int[s.length()];

        // Left to right
        int distance = s.length();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            result[i] = distance;
        }

        // Right to left
        distance = s.length();

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == c) {
                distance = 0;
            } else {
                distance++;
            }

            result[i] = Math.min(result[i], distance);
        }

        // Print result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        String s = "loveleetcode";
        char c = 'e';

        find(s, c);
    }
}