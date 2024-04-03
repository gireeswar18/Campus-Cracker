import java.util.*;

/*
61.sort the array odd numbers in ascending and even numbers in descending.
I/p 5 8 11 6 2 1 7
O/p 1 5 7 11 8 6 2
 */
public class Sum61 {
    public static void main(String[] args) {
        // 1 5 7 11
        // 8 6 2

        int[] arr = {5, 8, 11, 6, 2, 1, 7};
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int x : arr)
        {
            if (x % 2 == 0)
            {
                even.add(x);
            }
            else
            {
                odd.add(x);
            }
        }
        Collections.sort(odd);
        Collections.sort(even, Collections.reverseOrder());
        int index = 0;
        for (int i : odd)
        {
            arr[index++] = i;
        }
        for (int i : even)
        {
            arr[index++] = i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
