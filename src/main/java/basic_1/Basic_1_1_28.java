package basic_1;

public class Basic_1_1_28 {
    public static void main(String[] args){
        int k = 0, s = 0, n = 100;

        // invariant : s = number of solutions to the inequality
        // x*x + y*y < n с x < k
        while (k*k < Math.sqrt(n)) {
            int l = 0, t = 0;
            // invariant: t = number of solutions
            // inequalities k*k + y*y < n with
            // 0<=y<l
            while ((k*k + l*l) < Math.sqrt(n)) {
                l += 1;
                t += 1;
            }
            // k*k + l*l >= n, so t = number
            // all solutions of the inequality
            // k*k + y*y < n


            // t = the number of solutions to the inequality
            // k*k + y*y < n
            // c y>=0 (for a given k)
            k += 1;
            s += t;

        }
        System.out.println(s);
        //k*k >= n, so s = the number of all solutions
        //no parity
    }
}
