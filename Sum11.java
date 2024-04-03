import java.util.Scanner;

/*
11.
Sample Input-
2
Hacker
Rank
Sample Output-
Hce akr
Rn ak
 */
public class Sum11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- != 0)
        {
            String str = sc.next();
            String odd = "";
            String even = "";

            for (int i = 0; i < str.length(); i++)
            {
                if (i % 2 == 0)
                    even += str.charAt(i);
                else
                    odd += str.charAt(i);
            }
            System.out.println(even + " " + odd);
        }
    }
}