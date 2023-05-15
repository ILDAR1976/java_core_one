package basic_1;

public class Basic_1_1_16 {
    public static void main(String[] args){
        int a = 30;
        int b = 18;

        int p = 1;
        int r = 0;

        int q = 0;
        int s = 1;

        int m = a;
        int n = b;

        int x = 0;
        int y = 0;

        // invariant:
        // GCD(a,b) = GCD(m ,n); m,n >= 0
        // m = p*a + q*b; n = r*a + s*b

        while (m != 0 &&  n != 0) {
            if (m > n) {
                m %= n; p -= r; q -= s;
            } else {
                n %= m; r -= p; s -= q;
            }
        }

        if (m==0) {
             x = r; y = s;
        } else {
             x = p; y = q;
        }

        System.out.println(a+" "+b+" "+x+" "+y+" "+(m+n)+" "+(a*x+b*y));

    }
}
