package basic_1;

public class Basic_1_1_33 {
    public static void main(String[] args) {
        int n = 7, k = n, a = 1, b = 0, l = 0;
        // invariant: 0 <= k, f(n) = a * f(k) + b * f(k+1)
        while (k != 0) {
            if (k % 2 == 0) {
                System.out.print(">k="+k+" ");
                l = k / 2;
                //k = 2l, f(k)=f(l), f(f+1) = f(2l+1) = f(l) + f(l+1),
                //f(n) = a*f(k) + b*f(k+1)=(a+b)*f(l) + b*f(l+1)
                a += b; k = l;
                System.out.println("a="+a+" b="+b);
            } else {
                System.out.print("k="+k+" ");
                l = k / 2;
                // k = 2l + 1, f(k) = f(l) + f(l+1)
                // f(k+1) = f(fl+2) = f(l+1),
                // f(n) = a*f(k) + b*f(k+1) = a*f(l) + (a+b)*f(l+1)
                b += a; k = l;
                System.out.println("a="+a+" b="+b);
            }
        }
        // k = 0, f(n) = a * f(0) + b*f(1) = b, what was required
        System.out.println(b);

    }

}
