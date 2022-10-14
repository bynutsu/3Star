public class Main {
    public static void main(String[] args) {
        System.out.println(Discriminant(2,3,4));
        Fraction fraction=new Fraction(10,10);
        Fraction fraction2=new Fraction(4,10);
        System.out.println(Fraction.simplify(fraction));
        System.out.println(Fraction.multiply(fraction,fraction2));
        System.out.println(Fraction.sum(fraction,fraction2));
    }
    public static double Discriminant(double A,double B,double C){
        return B*B-4*A*C;
    }
    public static String minLength(String[]strings){
        String A = strings[0];
        for (String string : strings) {
            if (A.length() > string.length()) {
                A = string;
            }
        }
        return A;
    }
}