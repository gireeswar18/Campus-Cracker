import java.util.*;

/*
73. Sort the array elements in descending order according to their frequency of occurrence
Input : [ 2 2 3 4 5 12 2 3 3 3 12 ]
Output : 3 3 3 3 2 2 2 12 12 4 5
 */
public class Sum73 {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 5, 12, 2, 3, 3, 3, 12};
        freq(arr);
    }

    public static void freq (int[] arr)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr)
        {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        // 2 -> 3
        // 3 -> 4
        // 12 -> 2
        // 4 -> 1
        // 5 -> 1

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> (hm.get(b) - hm.get(a)));

        for (int key : hm.keySet())
        {
            priorityQueue.add(key);
        }

        while (!priorityQueue.isEmpty())
        {
            Integer key = priorityQueue.poll();

            for (int j = 0; j < hm.get(key); j++)
            {
                System.out.print(key + " ");
            }
        }
    }
}
