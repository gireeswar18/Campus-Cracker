import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        for (int x : insert(arr, n, k))
        {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> insert (int[] arr, int size, int k)
    {
        List<Integer> list = new ArrayList<>();
        int n = 0;

        for (int x : arr)
        {
            if (x == 1)
            {
                n++;
                list.add(x);
            }
            if (n == k || x == 0)
            {
                n = 0;
                list.add(0);
            }
        }
        return list;
    }
}
