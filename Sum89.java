import java.util.Arrays;
import java.util.Scanner;

/*
89. Given an array of numbers and a window of size k.
Print the maximum of numbers inside the window for each step
as the window moves from the beginning of the array.
  INPUT  :
  Enter the array size  :  8
  Enter the elements  :  1,3,5,2,1,8,6,9
  Enter the window size  :  3
  OUTPUT  :
  5 5 5 8 8 9
 */
public class Sum89 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter window size: ");
        int k = sc.nextInt();

        for (int x : window(arr, size, k))
        {
            System.out.print(x + " ");
        }
    }

    public static int[] window (int[] arr, int size, int k)
    {
        int[] res = new int[size - k + 1];

        for (int i = 0; i < size - k + 1; i++)
        {
            int[] sub = Arrays.copyOfRange(arr, i, i + k);
            Arrays.sort(sub);
            res[i] = sub[k - 1];
        }

        return res;
    }
}
