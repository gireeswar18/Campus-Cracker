import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
6. Remove the duplicates in the String.
Testcase 1:
Input: Java1234
Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223:
Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
Testcase 3:
Input: aBuzZ9900
Output: aBuzC9012
(Replace the second ‘Z’ with ‘C’ as ‘a’ and ‘B’ are already there in the String. Replace with capital C as the letter to be replaced is capital Z. The second 9 turns out to be zero and the zero turns out to ‘1’ and the second zero turns out to ‘2’)

 */
public class Sum6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        HashSet<Character> chars = new HashSet<>();
        HashSet<Integer> nums = new HashSet<>();
        String res = "";
        char[] arr = str.toLowerCase().toCharArray();

        for (int i = 0; i < str.length(); i++)
        {
            char x = arr[i];
            if (x >= 'a' && x <= 'z')
            {
                if (chars.add(x))
                {
                    res += str.charAt(i);
                }
                else
                {
                    boolean flag = true;
                    if (x == 'z')
                    {
                        x = 'a';
                    }
                    else
                    {
                        x++;
                    }

                    while (flag)
                    {
                        if (chars.add(x))
                        {
                            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                                res += (char)(x - 32);
                            else
                                res += x;

                            flag = false;
                        }
                        else
                        {
                            x++;
                        }
                    }
                }
            }
            else
            {
                if (nums.add(x - '0'))
                {
                    res += x;
                }
                else
                {
                    boolean flag = true;
                    if ((x - '0') == 9)
                    {
                        x = '0';
                    }
                    else {
                        x++;
                    }
                    while (flag)
                    {
                        if (nums.add(x - '0'))
                        {
                            res += (x - '0');
                            flag = false;
                        }
                        else
                        {
                            x++;
                        }
                    }
                }
            }
        }
        System.out.println(res);
    }
}
