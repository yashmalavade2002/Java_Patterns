
// Pattern 6
import java.util.*;

public class patterns {
    public static void main(String[] args) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {

            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5
  */
