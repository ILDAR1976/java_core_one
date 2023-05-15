package basic_1;

public class Basic_1_1_10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 16;


        // invariant: m = powMatrix(i);

        System.out.println(a+" "+n);
        System.out.print(a);

        Vector v = new Vector();
        Matrix m = new Matrix();

        for (int i=1; i<n; i++) {
            m = powMatrix(i);
            v = getVector(m);
            System.out.print(","+v.a1);
        }
    }

    private static Vector getVector(Matrix m) {
        Vector outVector = new Vector();

        outVector.a1 = m.a21;
        outVector.a2 = m.a11;

        return outVector;
    }

    private static Matrix powMatrix(int pow) {
        Matrix m = new Matrix();
        Matrix tm = new Matrix();
        Matrix jm = new Matrix();

        m.a11 = 1;
        m.a12 = 1;
        m.a21 = 1;
        m.a22 = 0;

        jm.a11 = m.a11;
        jm.a12 = m.a12;
        jm.a21 = m.a21;
        jm.a22 = m.a22;

        for (int i = 0; i<pow-1; i++) {
            tm.a11 = jm.a11;
            tm.a12 = jm.a12;
            tm.a21 = jm.a21;
            tm.a22 = jm.a22;

            jm.a11 = tm.a11 * m.a11 + tm.a12 * m.a21;
            jm.a12 = tm.a11 * m.a12 + tm.a12 * m.a22;
            jm.a21 = tm.a21 * m.a11 + tm.a22 * m.a21;
            jm.a22 = tm.a21 * m.a12 + tm.a22 * m.a22;
        }

        return jm;
    }


    private static class Matrix {
        int a11;
        int a12;
        int a21;
        int a22;
    }

    private static class Vector {
        int a1;
        int a2;

        public Vector(){}
        public Vector(int a1,int a2){
            this.a1 = a1;
            this.a2 = a2;
        }
    }

}
