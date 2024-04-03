import java.util.Arrays;

/*
42. Given an array of integers of size n.
Convert the array in such a way that if next valid number
is same as current number, double its value and replace
the next number with 0. After the modification,
rearrange the array such that all 0’s are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0
 */
public class Sum42 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 0, 4, 0, 8};

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] != 0 && arr[i - 1] != 0 && arr[i] == arr[i - 1])
            {
                arr[i - 1] = arr[i - 1] * 2;
                arr[i] = 0;
            }
        }

        int i = 0, j = 0;
        while (i < arr.length && j < arr.length)
        {
            if (arr[i] == 0 && arr[j] == 0)
            {
                j++;
            }
            else if (arr[i] != 0 && arr[j] != 0)
            {
                i++;
                j++;
            }
            else
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
