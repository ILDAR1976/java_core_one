package basic_2;

public class Basic_1_2_2 {
    public static void main(String[] args){
        dimension_fill(10);
    }

    private static void dimension_fill(int n){
        int i = 0, k = 0;
        int[] x = new int[n];
        //invariant: the first i value x[1]..x[i] equals 0
        while (i != n) {
            //x[1]..x[i-1] = 0
            x[i] = 0;
            System.out.print("x["+ i +"] = " + x[i] + " ");
            i++;
        }
        k = i;
        System.out.println();
        System.out.print("Quantity: " + k);
    }
}
