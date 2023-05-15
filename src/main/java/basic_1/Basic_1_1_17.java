package basic_1;

public class Basic_1_1_17 {
    public static void main(String[] args) {
        int a = 15;
        int b = 21;

        int u = b;
        int v = a;
        int z = 0;

        int m = a;
        int n = b;


        // invariant:
        // GCD(a,b) = GCD(m ,n); m,n >= 0

        while (!(m == 0 ||  n == 0)) {
            if (m >= n) {
                m -= n; v += u;
            } else {
                n -= m; u += v;
            }
        }

        if (m==0) {
            z = v;
        } else {
            z = u;
        }

        System.out.println(a+" "+b+" "+v+" "+u+" "+z+" "+2*((a*b)/(m+n))+" lcm: "+ z/2);

    }
}
