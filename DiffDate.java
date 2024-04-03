import java.util.Scanner;

public class DiffDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date1 = sc.next();
        String date2 = sc.next();

        System.out.println("Difference between days: " + calDiff(date1, date2));
    }

    public static int calDiff (String date1, String date2)
    {
        int day1 = Integer.parseInt(date1.substring(0, 2));
        int month1 = Integer.parseInt(date1.substring(3, 5));
        int year1 = Integer.parseInt(date1.substring(6));

        int day2 = Integer.parseInt(date2.substring(0, 2));
        int month2 = Integer.parseInt(date2.substring(3, 5));
        int year2 = Integer.parseInt(date2.substring(6));

        int diffInDays = 0;
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0)
            daysInMonths[1] = 29;

        if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0)
            daysInMonths[1] = 29;

        while (year1 < year2 || month1 < month2 || day1 < day2)
        {
            diffInDays++;
            day1++;
            if (day1 > daysInMonths[month1 - 1])
            {
                day1 = 1;
                month1++;
                if (month1 > 12)
                {
                    month1 = 1;
                    year1++;
                    if ((year1 % 4 == 0 && year1 % 100 != 0) || year1 % 400 == 0)
                    {
                        daysInMonths[1] = 29;
                    }
                    else
                    {
                        daysInMonths[1] = 28;
                    }
                }
            }
        }
        return diffInDays;
    }
}
