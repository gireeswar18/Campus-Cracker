import java.util.HashSet;
import java.util.Scanner;

/*
87. Given an array of numbers. Print the numbers without duplication.
  INPUT  :
  Enter the array size  :  4
  Enter the elements  :  1 1 2 4
  OUTPUT  :
  1 2 4
 */
public class Sum87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> nums = new HashSet<>();

        for (int x : arr)
        {
            if (nums.add(x))
            {
                System.out.print(x + " ");
            }
        }
    }
}
