/*
105) Given a 2D grid of characters, you have to search for all the words in a dictionary by
moving only along two directions, either right or down. Print the word if it occurs.

Sample :
  a   z  o   l
  n   x  h   o
  v   y   i   v
  o   r   s  e
 Dictionary = {van, zoho, love, are, is}

 Output:
    zoho
    love
    Is
 */
public class Sum105 {
    public static void main(String[] args) {
        String[] dict = {"van", "zoho", "love", "are", "is"};
        char[][] matrix = {{'a', 'z', 'o', 'l'},
                           {'n', 'x', 'h', 'o'},
                           {'v', 'y', 'i', 'v'},
                           {'o', 'r', 's', 'e'}};

        for (String str : dict)
        {
            if (find(matrix, matrix.length, matrix[0].length, str.toCharArray()))
                System.out.println(str);
        }
    }

    public static boolean find (char[][] matrix, int m, int n, char[] str)
    {
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (matrix[i][j] == str[0])
                {
                    if (checkRight(matrix, i, j, str, 1))
                        return true;

                    if (checkDown(matrix, i, j, str, 1))
                        return true;
                }
            }
        }
        return false;
    }

    public static boolean checkRight (char[][] matrix, int i, int j, char[] str, int index)
    {
        if (index == str.length)
            return true;

        if (i + 1 < matrix.length && matrix[i + 1][j] == str[index])
        {
             return checkRight(matrix, i + 1, j, str, index + 1) || checkDown(matrix, i + 1, j, str, index + 1);
        }
        else
        {
            return false;
        }

    }

    public static boolean checkDown (char[][] matrix, int i, int j, char[] str, int index)
    {
        if (index == str.length)
            return true;

        if (j + 1 < matrix[0].length && matrix[i][j + 1] == str[index])
        {
            return checkDown(matrix, i, j + 1, str, index + 1) || checkRight(matrix, i, j + 1, str, index + 1);
        }
        else
        {
            return false;
        }
    }
}
