package basic_1;

public class Basic_1_1_32 {
    public static void main(String[] args) {
        //Denomination: f[n,1]=f(f(...f(1)...)) (n times)
        int k = 1, a = f(1), b= f(f(1));
        //a = f[k,1]; b = f[2k, 1]
        while ( a != b ) {
            k++; a = f(a); b = f(f(b));
        }

        //a = f [k,1] = f [2k,1]; f[k,1]  is a part of the reperiodic part
        int l = 1; b=f(a);
        // b = f[k+l,1]; f[k,1],...,f[k+l-1,1] are different
        while ( a != b) {
            l++; b = f(b);
        }
        //the period equals l
        System.out.println(l);
    }

    private static int f(int x ) {
        double r = Math.sin(((double)x)/10.0)*100;
        return (int)r;
    }
}
