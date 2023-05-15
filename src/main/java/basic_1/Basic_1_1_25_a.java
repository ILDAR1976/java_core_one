package basic_1;

public class Basic_1_1_25_a {
    public static void main (String[] args) {
        int a = 0;
        int b = 3;

        boolean isPrime = false;

        if (a!=0 && b!=0) {
            isPrime = normIsPrime(a,b);
        } else {
            isPrime = isPrimeByGauss(a,b);
        }

        if (isPrime) System.out.print(" The number " + a + numberWithSgn(b) + " is a prime number");
        else System.out.print(" The number " + a + numberWithSgn(b)  + " is not a prime number");
    }

    private static String numberWithSgn(int n) {
        if (n < -1) {
            return String.valueOf(n) + "i";
        } else if (n == -1) {
            return "-i";
        } else if (n == 0) {
            return "";
        } else if (n == 1){
            return "+i";
        } else {
            return "+" + String.valueOf(n) + "i";
        }

    }

    private static boolean isPrimeByGauss(int x, int y){
        int n = x*x + y*y;

        boolean isPrime = false;

        if (x == 0 || y ==0 ) {
            for (int i = -n; i<= n; i++) {
                if (x == 4*i + 3 || y == 4*i + 3)  {
                    isPrime = true;
                    break;
                }
            }
        } else {
            return false;
        }

        return isPrime;
    }

    private static boolean normIsPrime(int x, int y){
        int n = x*x + y*y;

        int k = n;
        int l = 2;

        if (x == 0 && y == 0 ) return false;

        while (!(k == 1)) {
            if (k % l == 0) {
                k /= l;
            } else {
                l++;
            }
        }
        return l==n;
    }
}
