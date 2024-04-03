import java.util.Scanner;

/*
28.Reverse the given string keeping the position of special characters intact
 */
public class Sum28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int i = 0, j = str.length() - 1;
        char[] arr = str.toLowerCase().toCharArray();

        while (i < j)
        {
            if (!(arr[i] >= 'a' && arr[i] <= 'z'))
            {
                i++;
            }
            else if (!(arr[j] >= 'a' && arr[j] <= 'z'))
            {
                j--;
            }
            else
            {
                arr[i] = str.charAt(j);
                arr[j] = str.charAt(i);
                i++;
                j--;
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
