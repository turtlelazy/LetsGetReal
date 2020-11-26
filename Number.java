public abstract class Number {
    public abstract double getValue();

    public boolean equals(Number other) {
        if (getValue() == 0.0 || other.getValue() == 0.0) {
            return getValue() == other.getValue();
        } else {
            return (getValue() - other.getValue()) * (getValue() - other.getValue()) < 0.000001;
        }
    }

    


}
