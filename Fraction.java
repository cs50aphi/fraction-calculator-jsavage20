

public class Fraction {
    //instance variables
    int numerator;
    int denominator;

    public Fraction(int n, int d){
        try{
            numerator = n;
            denominator = d;
        }
        catch (IllegalArgumentException e){

        }
        if (n < 0 && d < 0){
            n = +n;
            d = +d;
        }
        else if (d < 0){
            n = -n;
            d = +d;
        }

        numerator = n;
        denominator = d;
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
        int comd = n.getDenominator() * denominator;
        int ans = n.getDenominator()*numerator + n.getNumerator()*denominator;
        return new Fraction(ans, comd);
    }

    public Fraction subtract(Fraction n){
        int comd = n.getDenominator() * denominator;
        int ans = n.getDenominator()*numerator - n.getNumerator()*denominator;
        return new Fraction(ans, comd);
    }

    public Fraction multiply(Fraction n){
        return new Fraction(n.getNumerator()*numerator, n.getDenominator()*denominator);
    }

    public Fraction divide(Fraction n){
        return n;
    }




}