import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
62. It’s about anagram.i/p was array of strings
and a word was given to find whether it has anagram in given array.
I/p catch, got, tiger, mat, eat, Pat, tap, tea

Word: ate
O/p eat, tea
 */
public class Sum62 {
    public static void main(String[] args) {
        String[] arr = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
        String word = "ate";

        char[] w = word.toLowerCase().toCharArray();
        Arrays.sort(w);
        String sWord = "";
        for (char x : w)
        {
            sWord += x;
        }

        for (String x : arr)
        {
            char[] e = x.toLowerCase().toCharArray();
            Arrays.sort(e);
            String res = "";
            for (char m : e)
            {
                res += m;
            }
            if (sWord.equals(res))
                System.out.println(x);
        }

    }

}
