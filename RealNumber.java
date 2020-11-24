public class RealNumber{
    private double value;

    public RealNumber(double v){
        value = v;
    }

    public double getValue(){
        return value;
    }

    public String toString(){
        return ""+getValue();
    }

    public RealNumber add(RealNumber other){
        return new RealNumber(other.getValue() + getValue()); 
    }

    public RealNumber subtract(RealNumber other) {
        return new RealNumber(getValue()-other.getValue());
    }

    public RealNumber multiply(RealNumber other) {
        return new RealNumber(getValue()*other.getValue());
    }

    public RealNumber divide(RealNumber other){
        return new RealNumber(getValue()/other.getValue());
    }

    public boolean equals(RealNumber other){
        if(getValue() == 0.0 || other.getValue() == 0.0){
            return getValue() == other.getValue();
        }
        else{
            return (getValue() - other.getValue())* (getValue() - other.getValue()) < 0.000001;
        }
    }
}