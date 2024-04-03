/*
7. Print whether the version is upgraded, downgraded or not changed according to the input given.
example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded,
Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded
 */

public class Sum7 {
    public static void main(String[] args) {
        String v1 = "4.1.1";
        String v2 = "3.7.4";

        char[] arr1 = v1.toCharArray();
        char[] arr2 = v2.toCharArray();

        int i = 0, j = 0;
        int num1 = 0, num2 = 0;

        while (i < arr1.length)
        {
            if (arr1[i] == '.')
            {
                i++;
            }
            else
            {
                num1 = num1 * 10 + (arr1[i] - '0');
                i++;
            }
        }

        while (j < arr2.length)
        {
            if (arr2[j] == '.')
            {
                j++;
            }
            else
            {
                num2 = num2 * 10 + (arr2[j] - '0');
                j++;
            }
        }

        if (num1 == num2)
            System.out.println("Not Changed");
        else if (num1 > num2)
            System.out.println("Downgraded");
        else
            System.out.println("Upgraded");
    }
}
