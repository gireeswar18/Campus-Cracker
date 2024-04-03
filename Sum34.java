import java.util.Scanner;

public class Sum34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n - i; j++)
            {
                sum1 += mat[i][j];
            }
        }
        // O(n2) + O(n2) => O(2n2) => O(n2)

        for (int i = 0; i < m; i++)
        {
            for (int j = n - i - 1; j < n; j++)
            {
                sum2 += mat[i][j];
            }
        }

        System.out.println(Math.max(sum1, sum2));
    }
}
