package patterns;

/*
*********
 *******
  *****
   ***
    *
 */

public class Pattern8 {

    static void main() {
        for (int i = 5; i >= 1; i--) {

            //printing the spaces
            for (int j = 5; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i -1); j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
