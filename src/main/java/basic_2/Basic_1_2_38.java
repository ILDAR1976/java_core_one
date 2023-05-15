package basic_2;

public class Basic_1_2_38 {
    public static void main(String[] args) {
        int[] x = fill(10);
        System.out.print("x = ");print(x);
        int pass = find(x);
        System.out.println("The number is the pass: " + pass);
    }
    private static int[] fill() {
        int[] x =  {0,1,2,3,4,0};
        return x;
    }
    private static int[] fill(int n) {
        int[] x =  new int[n];
        for(int i = 0; i < n;i++) {
           x[i] = i;
        }
        x[(int)(Math.random()*n)] = 0;
        return x;
    }
    private static int find(int[] x) {
        int n = x.length-1, sum = ((n+1)*n)/2, localSum = 0;

        for (int i = 0;  i<x.length; i++) {
            localSum += x[i];
        }
        return sum - localSum;
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
