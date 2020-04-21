

public class Fraction {
    //instance variables
    int numerrator
    int denominator

    public Fraction(int n, int d){
        if (n < 0 && d < 0){
            n = +n;
            d = +d;
        }
        else if (d < 0){
            n = -n;
            d = +d
        }

        numerator = n;
        denomimator = d;
    }

    public Fraction(int n){
        numerator = n;
        denominator = 1;
    }

    public Fraction(){
        numerator = 0;
        denominator = 1;
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public String toString(){
        String d = String.valueOf(denominator);
        String n = String.valueOf(numerator);
        return n + "/" + d;
    }

    public double toDouble(){
        return (double) numerator / denominator;
    }

    public Fraction add(Fraction n){
        int comd = n.getDenomnimator() * denominator;
        int ans = n.getDenominator()*numerator + n.getNumerator()*denominator;
        return Fraction(ans, comd)
    }




}