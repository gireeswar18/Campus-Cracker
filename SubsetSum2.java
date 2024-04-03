import java.util.ArrayList;
import java.util.List;

public class SubsetSum2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 8};
        int target = 8;

        function(arr, arr.length, target);
    }
    public static void function (int[] arr, int size, int target)
    {
        List<List<Integer>> listOfSubset = new ArrayList<>();
        subsetOfTarget(arr, size, 0, 0, target, new ArrayList<>(), listOfSubset);


        for (List<Integer> list : listOfSubset)
        {
            for (int x : list)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    public static void subsetOfTarget (int[] arr, int size, int index, int sum, int target, List<Integer> currentList, List<List<Integer>> res)
    {
        if (index == size)
        {
            if (sum == target)
            {
                res.add(new ArrayList<>(currentList));
            }
            return;
        }

        // pick
        currentList.add(arr[index]);
        subsetOfTarget(arr, size, index + 1, sum + arr[index], target, new ArrayList<>(currentList), res);

        // do not pick
        currentList.remove(currentList.size() - 1);
        subsetOfTarget(arr, size, index + 1, sum, target, new ArrayList<>(currentList), res);
    }
}
