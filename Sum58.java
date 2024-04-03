import java.util.Scanner;

/*
58.
Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence,
count the number of possible decodings of the given digit sequence.
Examples:
Input: digits[] = “121”
Output: 3 // The possible decodings are “ABA”, “AU”, “LA”
Input: digits[] = “1234” Output: 3
// The possible decodings are “ABCD”, “LCD”, “AWD”
 */
public class Sum58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = str.length();
        int[] dp = new int[n + 1];

        if (str.length() == 0 || str.charAt(0) == '0')
        {
            return;
        }

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++)
        {
            int oneDigit = str.charAt(i - 1) - '0';
            int twoDigit = (str.charAt(i - 2) - '0') * 10 + str.charAt(i - 1) - '0';

            if (oneDigit >= 1 && oneDigit <= 9)
            {
                dp[i] = dp[i] + dp[i - 1];
            }
            if (twoDigit >= 10 && twoDigit <= 26)
            {
                dp[i] = dp[i] + dp[i - 2];
            }
        }
        System.out.println(dp[n]);
    }
}
