package basic_1;

public class Basic_1_1_31 {
    public static void main(String[] args){
        double n=21, l=0, r = 1;
        // invariant: r/n = the result of break of l signs in 1/n
        while (l != n+1) {
            r = (10*r) % n;
            l++;
        }

        double c = (int)r;

        // c = (n+1)th member of the sequence of rests

        r = (10*r) % n;
        int k = 1;
        // r = (n+k+1)th member of the sequence of rests

        while (r != c) {
            r = (10*r) % n;
            k++;
        }
        System.out.println(1/n);
        System.out.println(k);
    }
}
