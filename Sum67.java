import java.util.Arrays;

/*
67.form the largest possible number using the array of numbers.
 */
public class Sum67 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int num = 0;
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--)
        {
            num = num * 10 + arr[i];
        }
        System.out.println(num);
    }
}
