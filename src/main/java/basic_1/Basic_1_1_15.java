package basic_1;

public class Basic_1_1_15 {
    public static void main(String[] args) {
        int a = 6;
        int b = 80;
        int c = 0;

        c = gcd(a,b);
        System.out.println(a+" "+b+" "+c);
    }

    private static int gcd(int a, int b) {
        int m = a;
        int n = b;


        int p = 1;
        int r = 0;

        int q = 0;
        int s = 1;


        int x = 0;
        int y = 0;

        int k = 0;

        int i = 0;

        // invariant:
        // GCD(a,b) = GCD(m ,n); m,n >= 0
        // m = p*a + q*b; n = r*a + s*b

        System.out.println(a+" "+b+" "+k+" "+x+" "+y);


        while (!((m == 0) || (n==0))) {
            if (m >= n) {
                m -= n; p -= r; q -= s;
            } else {
                n -= m; r -= p; s -= q;
            }
            System.out.println((++i)+". "+m+" "+n+"  --> "+(p*a+q*b)+" "+(r*a+s*b));
        }

        if (m==0) {
            k = n; x = r; y = s;
        } else {
            k = m; x = p; y = q;
        }

        System.out.println(a+" "+b+" "+k+" "+x+" "+y+" "+(a*x+b*y));

        return k;
    }
}
