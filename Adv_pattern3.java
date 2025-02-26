public class NumberPyramid {
    public static void main(String[] args) {
        int n = 5; // Size of the pyramid

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            // Move to next line
            System.out.println();
        }
    }
}

/*
    1 
   2 2
  3 3 3 
 4 4 4 4
5 5 5 5 5
 */
