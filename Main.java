public class Main {
    public static void main(String[] args){
        RationalNumber x = new RationalNumber(0,1);
        System.out.print(x.getValue());
        System.out.println(" Should print 0.0");
        System.out.println(x.getNum() + "/" + x.getDen());

        RationalNumber y = new RationalNumber(5, 0);
        System.out.print(y.getValue());
        System.out.println(" Should print 0.0");
        System.out.println(y.getNum() + "/" + y.getDen());

        RationalNumber z = new RationalNumber(2, 3);
        System.out.print(z.getValue());
        System.out.println(" Should print 0.666...");
        System.out.println(z.getNum() + "/" + z.getDen());

    }
}
