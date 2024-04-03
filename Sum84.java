import java.util.HashSet;
import java.util.Scanner;

/*
84. Given a two-dimensional array which consists of only 0’s and 1’s. Print the matrix without duplication.
  Ex.  INPUT  :

    Enter Row Size    :  4
    Enter column size  :  3
    Enter the matrix  :
    1 0 1
    1 1 0
    1 1 1
    1 0 1

    OUTPUT  :

    Unique Matrix  :
    1 0 1
    1 1 0
    1 1 1
 */
public class Sum84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Row Size: ");
        int row = sc.nextInt();
        System.out.println("Enter Column Size: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                matrix[i][j] = sc.nextInt();

        HashSet<Integer> h = new HashSet<>();

        System.out.println("Unique Matrix: ");
        for (int i = 0; i < row; i++)
        {
            int num = 0;
            for (int j = 0; j < col; j++)
            {
                num = num * 10 + matrix[i][j];
            }
            if (h.add(num))
            {
                for (int k = 0; k < col; k++)
                {
                    System.out.print(matrix[i][k] + " ");
                }
            }
            System.out.println();
        }

    }
}
