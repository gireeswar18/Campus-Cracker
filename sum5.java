/*
5. Given a matrix of 2D array of n rows and m columns. Print this matrix in ZIG-ZAG fashion as shown in figure.

Example:
Input:
1 2 3
4 5 6
7 8 9
Output:
1 2 4 7 5 3 6 8 9
 */

public class sum5 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 12, 15},
                {4, 5, 6, 16, 17},
                {7, 8, 9, 18, 20},
                {21, 22, 23, 24, 25},
                {41, 42, 43, 44, 45}
                };

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length - i - 1; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }
        int col = 0;
        for (int i = matrix.length - 1; i >= 0; i--)
        {
            System.out.print(matrix[i][col++] + " ");
        }
        for (int i = 1; i < matrix.length; i++)
        {
            for (int j = matrix[0].length - i; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
