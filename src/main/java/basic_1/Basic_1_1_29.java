package basic_1;

public class Basic_1_1_29 {
    public static void main(String[] args) {
        int k = 0, l = 0, n = 100;
        while (l*l < n) {
            l++;
        }
        //k = 0 , l is the minimum among those l >= 0 ,
        //for which <k , l> does not belong to X
        int s = 0;
        // invariant: "I"
        while (l != 0) {
            s++;
            //s - number of points in columns up to and including the k-th
            k++;
            //point <k , l> lies outside of X , but perhaps it must be
            // shifted downwards to restore "I"
            while ((l != 0) && ((k*k + (l-1)*(l-1))>n)) {
                l--;
            }
            //"I" , l = 0 , so the k-th column and all the following ones are empty,
            // and s equals the number you are looking for
        }
        System.out.println(s);
    }
}
