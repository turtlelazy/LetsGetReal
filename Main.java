public class Main {
    public static void main(String[] args){
        RationalNumber x = new RationalNumber(0,1);
        System.out.print(x.getValue());
        System.out.println(" Should print 0.0");
        System.out.println(x.getNumerator() + "/" + x.getDenominator());

        RationalNumber y = new RationalNumber(5, 0);
        System.out.print(y.getValue());
        System.out.println(" Should print 0.0");
        System.out.println(y.getNumerator() + "/" + y.getDenominator());

        RationalNumber z = new RationalNumber(2, 3);
        System.out.print(z.getValue());
        System.out.println(" Should print 0.666...");
        System.out.println(z.getNumerator() + "/" + z.getDenominator());

        System.out.print(z.reciprocal().getValue());
        System.out.println(" Should print 1.5");
        System.out.println(z.reciprocal().getNumerator() + "/" + z.reciprocal().getDenominator());

        System.out.print(z.equals(z.reciprocal()));
        System.out.println(" Should print false");

        System.out.print(z.equals(x));
        System.out.println(" Should print false");

        System.out.print(y.equals(x));
        System.out.println(" Should print true");

        System.out.print(x.toString());
        System.out.println(" Should print 0/1");

        System.out.print(y.toString());
        System.out.println(" Should print 0/1");

        System.out.print(z.toString());
        System.out.println(" Should print 2/3");

        System.out.print(z.reciprocal().toString());
        System.out.println(" Should print 3/2");

    }
}
