package basic_1;

public class Basic_1_1_24 {
    public static void main (String[] args) {
        int n = 113;
        int k = n;
        int l = 2;

        while (!(k == 1)) {
            if (k % l == 0) {
                k /= l;
            } else {
                l++;
            }
        }

        if (l == n) System.out.print(" The number " + n + " is a prime number");
        else System.out.print(" The number " + n + " is not a prime number");
    }
}
