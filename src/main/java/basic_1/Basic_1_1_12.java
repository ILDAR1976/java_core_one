package basic_1;

public class Basic_1_1_12 {
    public static void main(String[] args) {
        double a = 0;
        double fact = 1;
        int n = 15;

        // invariant: a += 1 / fact

        System.out.println(n);

        for (int i=0; i<n; i++) {
            if (i != 0) fact *= i;
            a += 1 / fact;
        }

        System.out.println(a);
    }

}
