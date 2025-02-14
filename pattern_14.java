/*A B C D 
  A B C D 
  A B C D 
  A B C D  /*
  // pattern 14
public class patterns {

    public static void main(String[] args) {
        int rows = 4;
        int col = 4;
        for (int i = 0; i < rows; i++) {
            for (char ch = 'A'; ch < 'A' + col; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
