package lesson16;
//OOP

public class main {
    public static void main(String [] args){
        Fraction f1 = new Fraction();
        f1.print();

        f1.setNom(1);
        f1.setDenom(2);
        f1.print();

        Fraction f2 = new Fraction(1,2);
        f2.print();

        Fraction f3 = f1.mul(f2);
        f3.print();

        Fraction f4 = f1.div(f2);
        f4.print();

        Fraction f5 = f1.add(f2);
        f5.print();

    }

}
