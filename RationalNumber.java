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
        return (double)getNumerator()/getDenominator();

    }

    public int getNumerator() {
        return numerator;

    }

    public int getDenominator() {
        return denominator;

    }
    
    public RationalNumber reciprocal(){
        return new RationalNumber(getDenominator(), getNumerator());
    }

    public boolean equals(RationalNumber other){
        return(getNumerator() == other.getNumerator() && getDenominator() == other.getDenominator());
    }

    public String toString() {
        return (getNumerator() + "/" + getDenominator());
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
        int GCF = gcd(getNumerator(),getDenominator());
        numerator /= GCF;
        denominator /= GCF;
    }

    public RationalNumber multiply(RationalNumber other){
        return new RationalNumber(getNumerator()*other.getNumerator(),getDenominator()*other.getDenominator());
    }

    public RationalNumber divide(RationalNumber other){
        return multiply(other.reciprocal());

    }

    public RationalNumber add(RationalNumber other){
        return new RationalNumber(getNumerator() * other.getDenominator() + other.getNumerator() * getDenominator(), 
                getDenominator() * other.getDenominator());
    }
    
    public RationalNumber subtract(RationalNumber other) {
        return new RationalNumber(getNumerator() * other.getDenominator() - other.getNumerator() * getDenominator(),
                getDenominator() * other.getDenominator());
    }

}
