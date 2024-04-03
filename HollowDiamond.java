public class HollowDiamond {
    public static void main(String[] args) {
        int n = 11;
        int mid = n / 2;
        int start = mid + 1;
        int end = mid - 1;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == 0 || i == n - 1 || j < start || j > end)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if (i < mid)
            {
                start--;
                end++;
            }
            else
            {
                start++;
                end--;
            }
            System.out.println();
        }
    }
}
