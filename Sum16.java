import java.util.Scanner;

/*
16.Assume there exists infinite grid, you’re given initial position x, y.
 Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.
	Input:
	4 5 //initial position x, y
	9 //number of movements
	U L R R D D U L R //7 movements
	Output:
    5 5
 */
public class Sum16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int n = sc.nextInt();
        char[] movements = new char[n];
        for (int i = 0; i < n; i++)
        {
            movements[i] = sc.next().charAt(0);
        }
//        y
//        |
//        |
//   -----|----- x
//        |
//        |

        for (char move : movements) // x -> 4 || y -> 6
        {
            if (move == 'L')
            {
                x = x - 1;
            }
            else if (move == 'R')
            {
                x = x + 1;
            }
            else if (move == 'U')
            {
                y = y + 1;
            }
            else if (move == 'D')
            {
                y = y - 1;
            }
        }
        System.out.println(x + " " + y);
    }
}
