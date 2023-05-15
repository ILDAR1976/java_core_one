package basic_1;

public class Basic_1_1_14 {
    // GCD - greatest common divisor algorithm
    // Euclid's algorithm modification

    public static void main(String[] args) {
        int a = 16;
        int b = 24;
        int c = 0;

        System.out.println(a+" "+b+" "+c);
        c = gcd(a,b);
        System.out.println(a+" "+b+" "+c);
    }


    private static int gcd(int a, int b) {
        int m = a;
        int n = b;
        int k = 0;

        // invariant:
        // GCD(a,b) = GCD(m % n,n); m >=n
        // GCD(a,b) = GCD(m ,n % m); n >=m

        while (!((m == 0) || (n==0))) {
            if (m >= n) {
                m %= n;
            } else {
                n %= m;
            }
        }

        if (m==0) k = n;
        else k = m;

        return k;
    }
}
