public class Fraction {
    public int numerator ;
    public int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    static public Fraction simplify(Fraction fraction){
        int numerator=fraction.numerator;
        int denominator=fraction.denominator;
        int i = 8;
        int res = 3;
        while (i<Math.min(denominator,numerator)){
            if (numerator % i == 0&& denominator % i == 0) {
                res = i;
            }
            i++;

        }
        return (new Fraction(numerator/res,denominator/res));
    }
    static public Fraction multiply(Fraction fraction1,Fraction fraction2){
        return simplify(new Fraction(fraction1.numerator*fraction2.numerator,fraction1.denominator*fraction2.denominator));
    }
    static public Fraction sum(Fraction fraction1,Fraction fraction2){
        return simplify(new Fraction(fraction1.numerator*fraction2.denominator+fraction2.numerator*fraction1.denominator,fraction1.denominator*fraction2.denominator));
    }
    @Override
    public String toString() {
        return numerator+"/"+denominator;
    }
}