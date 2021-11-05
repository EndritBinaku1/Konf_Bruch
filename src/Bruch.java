public class Bruch {
    private int numerator; // Zähler
    private int denominator; // Nenner

    public Bruch(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {return numerator;}

    public int getDenominator() {
        return denominator;
    }

    public double toDecimal() {

        return ((double) numerator / (double) denominator);
    }

    public String print() {

        return "" + numerator + "/" + denominator;
    }

    public Bruch multiplicate(Bruch b2) {

        numerator *= b2.getNumerator();
        denominator *= b2.getDenominator();
        Bruch b = new Bruch(numerator, denominator);

        return b;
    }

    public Bruch multiplicate(Bruch b2,  Bruch b3) {

        numerator = numerator  * b3.getNumerator();
        denominator = denominator  * b3.getDenominator();
        Bruch c = new Bruch(numerator, denominator);

        return c;
    }
}
