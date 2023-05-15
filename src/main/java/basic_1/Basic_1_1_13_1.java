package basic_1;

public class Basic_1_1_13_1 {

    // GCD - greatest common divisor algorithm, variant 1

    public static void main(String[] args) {
        int a = 24;
        int b = 16;
        int k = 0;

        // invariant: No number greater than k is a common divisor
        // (it is greater than one of the numbers a,b)

        System.out.println(a+" "+b+" "+k+" ");

        if (a < b) k = a;
        else k = b;


        while (!((a % k == 0) && ( b % k == 0))) {
            k -= 1;
        }

        System.out.println(a+" "+b+" "+k+" ");
    }
}
