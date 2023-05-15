package basic_2;

public class Basic_1_2_7 {
    public static void main(String[] args){
        int[] x = new int[10];
        fill(x);
        System.out.print("x = ");print(x);
        differents(x);
    }

    private static void fill(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            x[i] = (int)(Math.random() * 100);
        }
    }

    private static void differents(int[] x) {
        int k,u,n = x.length - 1 ;
        k = n; u = n;
        while (u != -1) {
            restore(u,k,x);
            u--;
        }

        int d = 1;

        while (k != 0) {
            exchange(0,k,x);
            k--;
            restore(0,k,x);

            if (x[0] != x[k+1]) d++;
        }
        System.out.print("differents: " + d);
    }

    private static void exchange(int i,int j,int[] x){
        int tmp = 0;
        tmp = x[i];
        x[i] = x[j];
        x[j] = tmp;
    }

    private static void restore(int s,int k,int[] x){
        int t = s;
        while(  ((2*t+1 <= k ) && (x[2*t+1] > x[t])) ||
                ((2*t <= k )   && (x[2*t] > x[t]))  ) {
            if ((2*t+1 <= k) && (x[2*t+1] >= x[2*t])) {
                exchange(t,2*t+1,x);
                t = 2*t+1;
            } else {
                exchange(t,2*t,x);
                t = 2*t;
            }
        }
    }

    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
