/*
3. Equilibrium index of an array is an index such that the sum of elements
 at lower indexes is equal to the sum of elements at higher indexes.
Example :
Input: A[] = {-7, 1, 5, 2, -4, 3, 0}
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1
 */
public class sum3 {
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};

        int left = 0;
        int flag = 0;
        int i;

        int right = 0;
        for (int x : arr)
        {
            right += x;
        }

        for (i = 0; i < arr.length; i++)
        {
            right -= arr[i];

            if (left == right)
            {
                flag++;
                break;
            }

            left += arr[i];
        }

        System.out.println(flag == 1 ? i : -1);

    }
}
