package basic_1;

public class Basic_1_1_11 {
    public static void main(String[] args) {
        double a = 0;
        int n = 15;

        // invariant: a += 1 / (getFactorial(i))

        System.out.println(n);

        for (int i=0; i<n; i++) {
            a += 1 / (getFactorial(i));
        }

        System.out.println(a);
    }

    private static double getFactorial(int n) {
        double xOut = 1;

        if (n == 0) return 1;

        while (n > 0)  {
            xOut *= n;
            n--;
        }
        return xOut;
    }
}
