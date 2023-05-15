package basic_1;

public class Basic_1_1_25_b {
    public static void main (String[] args) {
        int a = 4;
        int b = 17;
        int n = a * a + b * b;

        int i = 1;
        int j = 1;

        Reference<Integer> x = new Reference<Integer>(a);
        Reference<Integer> y = new Reference<Integer>(b);

        while (Math.abs(i) <= n) {
            while (Math.abs(j) <= n) {
                if (isDivisibleInteger(x.get(),y.get(), i, j) && !areTrivialDevisors(i, j,a,b)) {
                        divideWhole(x, y, i, j);
                        printComplexNumber(i, j);
                } else {
                    if (j < 0) {
                        j *= -1;
                        j++;
                    } else {
                        if (j == 0) {
                            j++;
                        } else  {
                            j *= -1;
                        }
                    }
                }
            }
            j = 0;
            if (i <0) {
                i *= -1;
                i++;
            } else {
                if (i == 0) {
                    i++;
                } else  {
                    i *= -1;
                }
            }
        }
        printComplexNumber(x.get(), y.get());
    }

    private static boolean areTrivialDevisors(int x, int y, int a, int b) {
        if (x == 1 && y == 0) return true;
        if (x == -1 && y == 0) return true;
        if (x == 0 && y == 1) return true;
        if (x == 0 && y == -1) return true;

        //The associated numbers
        if (x == -1*a && y == -1*b) return true;
        if (x == -1*b && y == a) return true;
        if (x == b && y == -1*a) return true;
        if (x == a && y == b) return true;

        return false;
    }
    private static boolean isDivisibleInteger(int a1, int b1, int a2, int b2) {
        double  numerator1 = (a1*a2+b1*b2);
        double  numerator2 = (a2*b1-a1*b2);
        double denominator = (a2*a2+b2*b2);
        double real = (denominator != 0 )? numerator1 / denominator:0;
        double image = (denominator != 0 )? numerator2 / denominator:0;

        double test_real = real - ((int)real);
        double test_image = image - ((int)image);

        return test_real == 0 && test_image == 0;
    }
    private static void divideWhole(Reference<Integer> a1, Reference<Integer> b1, int a2, int b2) {
        int  numerator1 = (a1.get()*a2+b1.get()*b2);
        int  numerator2 = (a2*b1.get()-a1.get()*b2);
        int denominator = (a2*a2+b2*b2);
        a1.set((denominator != 0 )? numerator1 / denominator:0);
        b1.set((denominator != 0 )? numerator2 / denominator:0);
    }
    private static void printComplexNumber(int a, int b) {
        if (a != 0 && b == 0) {
            System.out.println(a);
        } else if (a == 0 && b != 0) {
            System.out.println(printImageOne(b));
        } else if (a != 0 && b >= 0) {
            System.out.println(a + "+" + printImageOne(b));
        }  else if (a != 0 && b <= 0) {
            System.out.println(a + printImageOne(b));
        }
    }
    private static String printImageOne(int n) {
        return (Math.abs(n) == 1) ? (n < 0) ? "-i": "i": "" + n + "i";
    }

    private static class Reference<T> {
        private T referent;

        public Reference(T initialValue) {
            referent = initialValue;
        }

        public void set(T newVal) {
            referent = newVal;
        }

        public T get() {
            return referent;
        }
    }
}
