public class RationalNumber extends RealNumber{
    private int numerator, denominator;
    
    public RationalNumber(int nume, int deno){
        super(0.0);
        numerator = nume;
        if(deno == 0){
            numerator = 0;
            denominator = 0;
        }
        else{
            denominator = deno;
        }
    }

    @Override
    public double getValue(){
        return numerator/denominator;

    }

    
}
