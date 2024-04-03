import java.util.HashMap;
import java.util.Scanner;

/*
101 Given an array of positive integers. The output should be the number of occurrences of each number.
Example:
Input: {2, 3, 2, 6, 1, 6, 2}
Output:
1 – 1
2 – 3
3 – 1
6 – 2
 */
public class Sum101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 2, 6, 1, 6, 2};

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr)
        {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (int x : hm.keySet())
        {
            System.out.println(x + " - " + hm.get(x));
        }
    }
}
