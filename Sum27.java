/*
27.Find whether the given number is palindrome or not. Don’t use arrays or strings
 */
public class Sum27 {
    public static void main (String args[])
    {
        int num = 1011;
        System.out.println(checkPalindrome(num));
    }

    public static boolean checkPalindrome (int num)
    {
        int temp = num;
        int rev = 0;

        while (num != 0)
        {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if (rev == temp)
            return true;

        return false;
    }
}
