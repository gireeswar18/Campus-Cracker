import java.util.Scanner;

public class Sum56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(removePalindrome(str.toCharArray()));
    }

    public static String removePalindrome (char[] arr)
    {
        String word = "";
        String res = "";
        for (char x : arr)
        {
            if (x != ' ')
            {
                word += x;
            }
            else
            {
                if (!isPalindrome(word))
                    res += word + " ";
                word = "";
            }
        }
        if (!isPalindrome(word))
        {
            res += word;
        }
        return res;
    }

    public static boolean isPalindrome (String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
