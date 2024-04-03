/*
1. Replace every element with the greatest element on right side
Given an array of integers, replace every element with the next greatest element
(greatest element on the right side) in the array. Since there is no element
next to the last element, replace it with -1. For example, if the array is
{16, 17, 4, 3, 5, 2}, then it should be modified to {17, 5, 5, 5, 2, -1}.
 */


import java.util.Arrays;

public class sum1 {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--)
        {
            int num = arr[i];
            arr[i] = max;

            if (num > max)
                max = num;
        }

        System.out.println(Arrays.toString(arr));
    }
}
