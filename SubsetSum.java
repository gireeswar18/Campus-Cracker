import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 8};
        int[] arr2 = {3, 1,2};
        int target = 8;

        function(arr, arr.length, target);
    }

    public static void function (int[] arr, int size, int target)
    {
        List<Integer> sumOfEachSubset = new ArrayList<>();

        subsetCreator(arr, size, 0, 0, sumOfEachSubset);
        Collections.sort(sumOfEachSubset);
        for (int x : sumOfEachSubset)
        {
            System.out.print(x + " ");
        }

    }

    public static void subsetCreator (int[] arr, int size, int index, int sum, List<Integer> sumOfEachSubset)
    {
        if (index == size)
        {
            sumOfEachSubset.add(sum);
            return;
        }

        // pick the element
        subsetCreator(arr, size, index + 1, sum + arr[index], sumOfEachSubset);

        // do not pick the element
        subsetCreator(arr, size, index + 1, sum, sumOfEachSubset);
    }

    }

