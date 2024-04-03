import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordering {
    public static void main(String[] args) {
        int[] arr = {12, 5, 4, 7, 10};

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
        Collections.sort(even);
        Collections.sort(odd, Collections.reverseOrder());
        int m = 0, n = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (i % 2 == 0)
            {
               arr[i] = even.get(m++);
            }
            else
            {
                arr[i] = odd.get(n++);
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
