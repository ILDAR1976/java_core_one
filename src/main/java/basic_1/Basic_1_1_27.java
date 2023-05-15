package basic_1;

public class Basic_1_1_27 {
    public static void main (String[] args){
        int n = 173;
        //invariant : the remainder is to print k in reverse order
        int k = n;
        while (k > 0) {
            System.out.println(k % 10);
            k /= 10;
        }
    }
}
