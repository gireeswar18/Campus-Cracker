import java.util.*;
public class PermuteArr
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        permute(arr, 0, size - 1);
    }

    public static void permute (int[] arr, int left, int right)
    {
        if (left == right)
        {
            print(arr);
        }
        else
        {
            for (int i = left; i <= right; i++)
            {
                swap(arr, left, i);
                permute(arr, left + 1, right);
                swap(arr, left, i);
            }
        }
    }

    public static void swap (int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print (int[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
}

