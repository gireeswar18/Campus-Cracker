/*
4. In MS-Paint, when we take the brush to a pixel and click, the color of the region of that pixel is replaced with a new selected color. Following is the problem statement to do this task.
Given a 2D screen, location of a pixel in the screen and a color, replace color of the given pixel and all adjacent same colored pixels with the given color.
Example:
Input:
       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 2, 2, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 2, 2, 0},
                      {1, 1, 1, 1, 1, 2, 1, 1},
                      {1, 1, 1, 1, 1, 2, 2, 1},
                      };
    x = 4, y = 4, newColor = 3
The values in the given 2D screen indicate colors of the pixels.
x and y are coordinates of the brush, newColor is the color that
should replace the previous color on screen[x][y] and all surrounding
pixels with same color.

Output:
Screen should be changed to following.
       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 3, 3, 3, 3, 0, 1, 0},
                      {1, 1, 1, 3, 3, 0, 1, 0},
                      {1, 1, 1, 3, 3, 3, 3, 0},
                      {1, 1, 1, 1, 1, 3, 1, 1},
                      {1, 1, 1, 1, 1, 3, 3, 1},
                      };
 */

public class sum4 {
    public static void main(String[] args) {
        int[][] screen =  {{1, 1, 1, 1, 1, 1, 1, 1},
                            {1, 1, 1, 1, 1, 1, 0, 0},
                            {1, 0, 0, 1, 1, 0, 1, 1},
                            {1, 2, 2, 2, 2, 0, 1, 0},
                            {1, 1, 1, 2, 2, 0, 1, 0},
                            {1, 1, 1, 2, 2, 2, 2, 0},
                            {1, 1, 1, 1, 1, 2, 1, 1},
                            {1, 1, 1, 1, 1, 2, 2, 1},
                            };
        int x = 4 - 1, y = 4 - 1;
        int newColor = 3;
        int old = screen[x][y];

        for (int i = 0; i < screen.length; i++)
        {
            for (int j = 0; j < screen[0].length; j++)
            {
                if (screen[i][j] == old)
                {
                    screen[i][j] = newColor;
                }
            }
        }



        for (int i = 0; i < screen.length; i++) {
            for (int j = 0; j < screen[0].length; j++) {
                System.out.print(screen[i][j] + " ");
            }
            System.out.println();
        }
    }
}
