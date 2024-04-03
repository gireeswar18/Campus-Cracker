/*
63.array of numbers were given to find a number which has same sum of numbers in it’s either side.
I/p 1, 2, 3, 7, 6
O/p 7(has 1+ 2+3 in left 6 in right)
 */
public class Sum63 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 6};

        System.out.println(eqPoint(arr));

        }

    public static int eqPoint (int[] arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int x : arr) {
            rightSum += x;
        }

        for (int x : arr) {
            rightSum = rightSum - x;

            if (leftSum == rightSum) {
                return x;
            }

            leftSum += x;
        }
        return -1;
    }
}
