/*
45.Largest Sum Contiguous Subarray
(Kadane’ Algorithm )
 */
public class Sum45 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 5, 4};
        System.out.println(kadane(arr));
    }

    public static int kadane (int[] arr)
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : arr)
        {
            currentSum += num;
            if (currentSum > maxSum)
            {
                maxSum = currentSum;
            }
            if (currentSum < 0)
            {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
