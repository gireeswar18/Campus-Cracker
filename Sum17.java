import java.util.Scanner;

public class Sum17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int x : maxValue(arr, n))
        {
            System.out.print(x + " ");
        }
    }

    public static int[] maxValue (int[] arr, int n)
    {
        for (int i = 0; i < arr.length; i++)
        {
            int sum = 0, product = 1;
            int num = arr[i];

            while (num != 0)
            {
                sum += num % 10;
                product *= num % 10;
                num /= 10;
            }
            arr[i] = Math.max(sum, product);
        }
        return arr;
    }
}
