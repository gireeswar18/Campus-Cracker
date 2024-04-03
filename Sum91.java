/*
91 : Write a program to check if the given words are present in matrix given below.
 The words can be left to right, top to bottom and the diagonals (in top to bottom direction)
 */
public class Sum91 {
    public static void main(String[] args) {
        String word = "age";
        char[][] arr = {{'a', 'o', 'e'},
                        {'r', 'g', 'a'},
                        {'a', 'g', 'e'}};

        System.out.println(checkPresent(word.toCharArray(), arr));
    }

    public static boolean checkPresent (char[] chars, char[][] matrix)
    {
        int index = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == chars[index])
                {
                    if (checkRight(chars, matrix, i, j, index + 1))
                        return true;

                    if (checkBottom(chars, matrix, i, j, index + 1))
                        return true;

                    if (checkDiagonal(chars, matrix, i, j, index + 1))
                        return true;
                }
            }
        }
        return false;
    }


    public static boolean checkBottom (char[] arr, char[][] matrix, int i, int j, int index)
    {
        if (index == arr.length)
            return true;

        if (i + 1 < matrix.length && matrix[i + 1][j] == arr[index])
        {
            return checkBottom(arr, matrix, i + 1, j, index + 1);
        }
        else
        {
            return false;
        }
    }


    public static boolean checkRight (char[] arr, char[][] matrix, int i, int j, int index)
    {
        if (index == arr.length)
            return true;

        if (j + 1 < matrix[i].length && matrix[i][j + 1] == arr[index])
        {
            return checkRight(arr, matrix, i, j + 1, index + 1);
        }
        else
        {
            return false;
        }
    }

    public static boolean checkDiagonal (char[] arr, char[][] matrix, int i, int j, int index)
    {
        if (index == arr.length)
            return true;

        if (i + 1 < matrix.length && j + 1 < matrix[0].length && matrix[i + 1][j + 1] == arr[index])
        {
            return checkDiagonal(arr, matrix, i + 1, j + 1, index + 1);
        }
        else
        {
            return false;
        }
    }

}
