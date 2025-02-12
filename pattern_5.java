
// Pattern 5
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        int n = 4;

        // outer loop
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
  ****
   ***
    **
     *

 */
