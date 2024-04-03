/*
83. Print the following pattern
  Ex.  INPUT  :  5
    OUTPUT  :
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
  Ex.  INPUT  :  7
    OUTPUT  :
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1
       1 5 10 10 5 1
      1 6 15 20 15 6 1
 */
public class Sum83 {
    public static void main(String[] args) {

        int rows = 7;

        for (int i = 0; i < rows; i++)
        {
            int n = 1;
            for (int j = 0; j < rows - i - 1; j++)
            {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++)
            {
                System.out.print(n + " ");
                n = n * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
