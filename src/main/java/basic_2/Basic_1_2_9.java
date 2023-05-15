package basic_2;

public class Basic_1_2_9 {
    public static void main(String[] args){
        boolean[][] x = fill();
        System.out.println("x = ");print(x);
        System.out.print("The number of rectangles: " + numberRectangles(x));
    }

    private static boolean[][] fill() {
        int[][] x =  {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,0,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,1,1,1,0,0,0,0,1,1,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,1,0,0,0,1,0,0},
                {0,0,1,1,1,1,0,0,1,1,1,1,1,0,0},
                {0,0,1,0,0,1,0,0,0,0,0,0,0,0,0},
                {0,0,1,0,0,1,0,0,0,0,1,1,1,0,0},
                {0,0,1,1,1,1,0,0,0,0,1,0,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,1,1,0,0}
        };
        boolean[][] l = new boolean[x.length][x[0].length];
        for (int i = 0;  i<x.length; i++) {
            for (int j = 0;  j<x[0].length; j++) {
                l[i][j] = (x[i][j] == 1) ? true : false;
            }
        }
        return l;
    }
    private static int numberRectangles(boolean[][] l){
        int d = 0, x = 0, y = 0;
        for (int i = 0;  i<l.length; i++) {
            for (int j = 0;  j<l[0].length; j++) {
                x = i + 1; y = j + 1;
                if (x < l.length && y < l[0].length) {
                    if (   l[i][j] == true
                        && l[x][j] == true
                        && l[i][y] == true
                        ) d++;
                }

            }
        }
        return d;
    }
    private static void print(boolean[][] x) {
        for (int i = 0;  i<x.length; i++) {
            for (int j = 0;  j<x[0].length; j++) {
                System.out.print((x[i][j] == true) ? "1" : "0");
            }
            System.out.println();
        }
        System.out.println();
    }
}
