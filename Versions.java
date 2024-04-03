import java.util.Scanner;

public class Versions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String version1 = sc.next();
        String version2 = sc.next();

        System.out.println(checkVersions(version1, version2));
    }

    public static int checkVersions (String version1, String version2)
    {
        int num1 = 0;
        int num2 = 0;

        int i = 0, j = 0;
        char[] v1 = version1.toCharArray();
        char[] v2 = version2.toCharArray();

        while (i < v1.length || j < v2.length)
        {
            while (i < v1.length && v1[i] != '.' && v1[i] != '0')
            {
                num1 = num1 * 10 + (v1[i] - '0');
                i++;
            }
            while (j < v2.length && v2[j] != '.' && v2[j] != '0')
            {
                num2 = num2 * 10 + (v2[j] - '0');
                j++;
            }
            i++;
            j++;
        }

        if (num1 == num2)
            return 0;

        else if (num1 > num2)
            return 1;

        else
            return -1;
    }
}
