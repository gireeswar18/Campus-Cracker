import java.util.Scanner;

/*
55. Find the result subtraction, multiplication, division of two integers using + operator.
Input: 6 and 4
output:
addition 6+4 = 10,    subtraction  6+(-4) = 2,   multiplication = 24,   division = 1
Input : -8 and -4
Output:
addition -8+(-4) = -12,    subtraction  (-8)+(-(-4)) = -4,   multiplication = 32,   division = 2
 */
public class Sum55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a + (-1 * b)));
        System.out.println("Multiplication: " + multiply(a, b));
        System.out.println("Division: " + divide(a, b));
    }

    public static int multiply (int a, int b)
    {
        int res = 0;
        int n = Math.abs(a);
        int m = Math.abs(b);

        for (int i = 0; i < m; i++)
        {
            res = res + n;
        }

        if (a < 0 && b >= 0 || b < 0 && a >= 0) return -1 * res;

        return res;
    }

    public static int divide (int a, int b)
    {
        // a - numerator
        // b - denominator

        int res = 0;
        int count = 0;

        int n = Math.abs(a);
        int d = Math.abs(b);

        while (res + d <= n)
        {
            res += d;
            count++;
        }
        if (a < 0 && b >= 0 || b < 0 && a >= 0) return -1 * count;

        return count;
    }
}
