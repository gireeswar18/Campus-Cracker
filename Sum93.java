/*
93. Adding 2 numbers
Given 2 huge numbers as separate digits, store them in array
and process them and calculate the sum of 2 numbers and store the result in an array
and print the sum.
Input:
Number of digits:12
9 2 8 1 3 5 6 7 3 1 1 6
Number of digits:9
7 8 4 6 2 1 9 9 7
Output :
9 2 8 9 2 0 2 9 5 1 1 3
 */
public class Sum93 {
    public static void main(String[] args) {
        int a = 5, b = 5;
        int[] num1 = {5, 0, 0, 9, 9};
        int[] num2 = {5, 0, 0, 1, 1};

        for (int x : sum(num1, num2, a, b))
        {
            System.out.print(x + " ");
        }
    }

    public static int[] sum (int[] num1, int[] num2, int a, int b)
    {
        int i = a - 1;
        int j = b - 1;
        int[] res = new int[Math.max(a, b)];
        int index = res.length - 1;
        int carry = 0;

        while (i >= 0 && j >= 0)
        {
            int sum = num1[i] + num2[j] + carry;
            res[index--] = sum % 10;
            carry = sum / 10;
            i--;
            j--;
        }

        while (i >= 0)
        {
            res[index--] = (num1[i] + carry) % 10;
            carry = (num1[i] + carry) / 10;
            i--;
        }

        while (j >= 0)
        {
            res[index--] = (num2[j] + carry) % 10;
            carry = (num2[j] + carry) / 10;
            j--;
        }

        if (carry == 1)
        {
            int[] fin = new int[res.length + 1];
            fin[0] = 1;
            for (int k = 1; k < fin.length; k++)
            {
                fin[k] = res[k - 1];
            }
            return fin;
        }
        return res;

    }
}
