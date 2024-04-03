import java.util.Scanner;

public class Sum77 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print (int n)
    {
        for (int i = 0; i < Math.pow(2, n); i++)
        {
            int num = i;
            int[] arr = new int[n];
            int index = 0;

            while (num != 0)
            {
                arr[index++] = num % 2;
                num /= 2;
            }
            for (int j = arr.length - 1; j >= 0; j--)
            {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }
}
