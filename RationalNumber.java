public class RationalNumber extends RealNumber{
    private int numerator, denominator;
    
    public RationalNumber(int nume, int deno){
        super(0.0);

        if (deno < 0) {
            deno *= -1;
            nume *= -1;
        }
        if(deno == 0){
            numerator = 0;
            denominator = 1;
        }
        else{
            numerator = nume;
            denominator = deno;
        }
        reduce();
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
        if (a < 0){
            a*=-1;
        }
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

    private void reduce(){
        int GCF = gcd(numerator,denominator);
        numerator /= GCF;
        denominator /= GCF;
    }

    public RationalNumber multiply(RationalNumber other){
        return new RationalNumber(numerator*other.getNumerator(),denominator*other.getDenominator());
    }

    public RationalNumber divide(RationalNumber other){
        return multiply(other.reciprocal());

    }

    public RationalNumber add(RationalNumber other){
        return new RationalNumber(numerator * other.denominator + other.numerator * denominator, 
                denominator * other.denominator);
    }
    
    public RationalNumber subtract(RationalNumber other) {
        return new RationalNumber(numerator * other.denominator - other.numerator * denominator,
                denominator * other.denominator);
    }

}
