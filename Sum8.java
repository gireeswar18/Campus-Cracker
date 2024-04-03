import java.util.ArrayList;
import java.util.List;

/*
 Reverse the words in the given String1 from the first occurrence
 of String2 in String1 by maintaining white Spaces.
 example:
 String1 = This is a test String only
 String2 = st
 Output: This is a only String test
 */
public class Sum8 {
    public static void main(String[] args) {
        String s1 = "This is a test String only";
        String s2 = "st";

        List<String> lt = new ArrayList<>();
        String word = "";
        int index = -1;
        for (char x : s1.toCharArray())
        {
            if (x == ' ')
            {
                lt.add(word);
                word = "";
            }
            else
            {
                word += x;
            }
        }
        lt.add(word);

        String res = "";

        for (int i = 0; i < lt.size(); i++)
        {
            if (!lt.get(i).contains(s2))
            {
                res += lt.get(i) + " ";
            }
            else
            {
                for (int j = lt.size() - 1; j >= i; j--)
                {
                    res += lt.get(j) + " ";
                }
                break;
            }
        }
        res = res.stripTrailing();
        System.out.println(res);
    }
}
