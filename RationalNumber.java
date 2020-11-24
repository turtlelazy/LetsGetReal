public class RationalNumber extends RealNumber{
    private int numerator, denominator;
    
    public RationalNumber(int nume, int deno){
        super(0.0);
        numerator = nume;
        if(deno == 0){
            numerator = 0;
            denominator = 1;
        }
        else{
            denominator = deno;
        }
    }

    @Override
    public double getValue(){
        return (double)numerator/denominator;

    }

    public int getNumerator() {
        return numerator;

    }

    public int getDenominator() {
        return denominator;

    }
    
    public RationalNumber reciprocal(){
        return new RationalNumber(denominator, numerator);
    }

    public boolean equals(RationalNumber other){
        return(numerator == other.numerator && denominator == other.denominator);
    }

    public String toString() {
        return (numerator + "/" + denominator);
    }

    private static int gcd (int a, int b){
        if(b == 0){
            return a;
        }
        else if ((a % b) == 0){
            return b;
        }

        else{
            return gcd(b,a%b);
        }

    }

}
