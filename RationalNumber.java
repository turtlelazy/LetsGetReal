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

    public double getNumerator() {
        return numerator;

    }

    public double getDenominator() {
        return denominator;

    }


}
