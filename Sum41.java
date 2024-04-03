/*
41.Given a String with or without special characters
find if it is Palindrome or Not.
No splitting of array must be done or No additional spaces must be used for storing the array..
Eg: RACE CAR
Eg: I DID, DID I ?

 */
public class Sum41 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("RACE CAR"));
        System.out.println(isPalindrome("I DID, DID I ?"));
        System.out.println(isPalindrome("M. L A Y A L A M"));
    }

    public static boolean isPalindrome (String str)
    {
        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            if (!(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'))
                i++;

            else if (!(str.charAt(j) >= 'A' && str.charAt(j) <= 'Z'))
                j--;

            else if (str.charAt(i) == str.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}
