import java.util.HashSet;
import java.util.Scanner;

/*
51.Print all distinct permutations of a given string with duplicate characters.
 */
public class Sum51 {
    static HashSet<String> h = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        permute(str, 0, str.length() - 1);
    }

    public static void permute (String str, int left, int right)
    {
        if (left == right && h.add(str))
        {
            System.out.println(str);
        }
        else
        {
            for (int i = left; i <= right; i++)
            {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    public static String swap (String str, int i, int j)
    {
        char[] arr = str.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return String.valueOf(arr);
    }
}
