package patterns;

public class Pattern5 {
    static void main() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i ; j--) {
                System.out.print("*");

            }

            System.out.println();
        }
    }
}
