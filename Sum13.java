/*
13.Print the word with odd letters – PROGRAM
Sample Output-
P      P
 R    R
  O  O
   G
  R  R
 A    A
M      M
 */
public class Sum13 {
    public static void main(String[] args) {
        String str = "gireeswar";
        pattern(str);
    }
    public static void pattern (String str)
    {
        char[][] mat = new char[str.length()][str.length()];

        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                if (i == j)
                    mat[i][j] = str.charAt(i);
                else if (i + j == str.length() - 1)
                    mat[i][j] = str.charAt(i);
                else
                    mat[i][j] = ' ';
            }
        }


        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[0].length; j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
