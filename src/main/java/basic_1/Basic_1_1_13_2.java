package basic_1;

public class Basic_1_1_13_2 {

    // GCD - greatest common divisor algorithm, variant 2
    // Euclid's algorithm

    public static void main(String[] args) {
        int a = 126;
        int b = 112;
        int m = a;
        int n = b;
        int k = 0;

        // invariant: GCD(a,b) = GCD(m,n); m >=0

        System.out.println(a+" "+b+" "+m+" "+n+" "+k+" ");

        while (!((m == 0) || (n==0))) {
            if (m >= n) {
                m -= n;
            } else {
                n -= m;
            }
        }

        if (m==0) k = n;
        else k = m;

        System.out.println(a+" "+b+" "+m+" "+n+" "+k+" ");
    }
}
