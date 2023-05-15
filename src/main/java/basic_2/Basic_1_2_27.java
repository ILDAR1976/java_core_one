package basic_2;

public class Basic_1_2_27 {
    //The binary search
    public static void main(String[] args) {
        //int q = (int)(Math.random()*100);
        int q = 4;
        int[] x = new int[35];
        //fill(x);
        x = handmaidFill();
        System.out.println("q = " + q);
        System.out.print("x = ");print(x);
        if (search(x,q)) {
            System.out.println("The number " + q + " is found in the array x");
        } else {
            System.out.println("The number " + q + " is not found in the array x");
        }
    }
    private static int[] handmaidFill() {
        int[] x = { 4,6,6,11,13,14,16,20,20,22,24,28,29,30,33,34,39,
                39,40,45,49,49,49,51,52,54,54,57,62,66,71,76,80,82,82};
        return x;
    }
    private static void fill(int[] x) {
        x[0] = (int)(Math.random()/Math.nextDown(1.0) * 10);
        for (int i = 1;  i<x.length; i++) {
            while (x[i]<x[i-1]) {
                x[i] = (int)(Math.random() * 100);
                if (x[i] > 5 + x[i-1]) {
                    x[i] = 0;
                    continue;
                }
            }
        }
    }
    private static boolean search(int[] x, int q) {
        int n = x.length - 1,l = 0, r = n, m = 0;
        while (r-l != 0) {
            m = l + (r-l) / 2;
            if (x[m] <= q) {
                l = m + 1;
            } else {
                r = m;
            }
        }
        return (x[m] == q);
    }
    private static void print(int[] x) {
        for (int i = 0;  i<x.length; i++) {
            System.out.print(x[i] + "\t" );
        }
        System.out.println();
    }
}
