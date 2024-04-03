import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 5, -1, 15, 55, 21, 44, 21, 18, 4};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort (int[] arr, int low, int high)
    {
        if (low >= high)
        {
            return;
        }
        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        mergeArray(arr, low, mid, high);
    }

    public static void mergeArray (int[] arr, int low, int mid, int high)
    {
        int i = low;
        int j = mid + 1;

        List<Integer> list = new ArrayList<>();

        while (i <= mid && j <= high)
        {
            if (arr[i] < arr[j])
            {
                list.add(arr[i++]);
            }
            else
            {
                list.add(arr[j++]);
            }
        }

        while (i <= mid)
        {
            list.add(arr[i++]);
        }
        while (j <= high)
        {
            list.add(arr[j++]);
        }

        int index = 0;
        for (int k = low; k <= high; k++)
        {
            arr[k] = list.get(index);
            index++;
        }
    }
}
