package basic_2;

public class Basic_1_2_15 {
    public static void main(String[] args){
        int[] a = new int[6];
        int[] b = new int[6];
        handmadeFill1(a);
        handmadeFill2(b);
        revers(a);
        revers(b);
        System.out.print("a = ");print(a);
        System.out.print("b = ");print(b);
        System.out.print("c = ");print(mullPolinomians(a,b));
    }
    private static void fill(int[] a) {
        for (int i = 0;  i<a.length; i++) {
            a[i] = (int)(Math.random() * 100);
        }
    }
    private static void handmadeFill(int[] a) {
        int[] ha = {4,3};
        for (int i = 0;  i<a.length; i++) {
            a[i] = ha[i];
        }
    }
    private static void revers(int[] x){
        int n = x.length ;
        for (int i = 0; i < n / 2; i++) {
            int tmp = x[i];
            x[i] = x[n-i-1];
            x[n-i-1] = tmp;
        }
    }
    private static void handmadeFill1(int[] a) {
        int[] ha = {2,3,4,5,7,3};
        for (int i = 0;  i<a.length; i++) {
            a[i] = ha[i];
        }
    }
    private static void handmadeFill2(int[] a) {
        int[] ha = {1,2,3,4,8,5};
        for (int i = 0;  i<a.length; i++) {
            a[i] = ha[i];
        }
    }
    private static int[] mullPolinomians(int[] a, int[] b){
        int k = a.length, l = b.length;
        int[] c = new int[l+k];
        for(int i = 0;i < c.length-1;i++){
            c[i] = 0;
        }
        for(int i = 0;i < k;i++){
            for(int j = 0;j < l;j++){
                c[i+j] += a[i]*b[j];
            }
        }
        return c;
    }

    private static void print(int[] a) {
        for (int i = a.length-1;  i>=0; i--) {
            System.out.print(((i!=a.length-1)?"+":"") + a[i] + "*x^"+ i );
        }
        System.out.println();
    }

}
