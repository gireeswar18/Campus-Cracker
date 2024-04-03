import java.util.Arrays;

/*
2. Given a Boolean matrix mat[M][N] of size M X N,
 modify it such that if a matrix cell mat[i][j] is 1
 then make its adjacent cells as 0.
 */
public class sum2 {
    public static void main(String[] args) {
        boolean[][] mat = {{true, true, false},
                         {true, false, true},
                         {false, false, true}};

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                if (mat[i][j])
                {
                    if (i > 0)
                    {
                        mat[i - 1][j] = false;
                    }
                    if (i < mat.length - 1)
                    {
                        mat[i + 1][j] = false;
                    }
                    if (j > 0)
                    {
                        mat[i][j - 1] = false;
                    }
                    if (j < mat[0].length - 1)
                    {
                        mat[i][j + 1] = false;
                    }
                }
            }
        }

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
