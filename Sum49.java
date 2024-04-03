import java.util.Arrays;

/*
49.Given an array as input,
 The condition is if the number is repeated you
 must add the number and put the next index value to 0.
 If the number is 0 print it at the last.
Eg: arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8}
Output: 4 2 12 8 0 0 0 0 0
 */
public class Sum49 {
    public static void main(String[] args) {
        int[] arr = {0, 2, 2, 2, 0, 6, 6, 0, 8};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != 0)
            {
                if (arr[i] == arr[i + 1])
                {
                    arr[i] += arr[i];
                    arr[i + 1] = 0;
                }
            }
        }

        int[] res = new int[arr.length];

        int j = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] != 0)
            {
                res[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
