public class Fraction {
    //instance variables
    int numerator;
    int denominator;

    public Fraction(int n, int d){
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
        try{
            double i = (numerator * n.getDenominator()) / (denominator  * n.getNumerator());
        }
        catch (Exception e){
            return new Fraction();
        }
        return new Fraction(numerator * n.getDenominator(), denominator  * n.getNumerator());
    }

    public boolean equals(Object n){
        Fraction b = (Fraction) n;
        // n.toLowestTerms();
        if (b.getNumerator() == numerator && b.getDenominator() == denominator){
            return true;
        }
        return false;
    }
    
    public void toLowestTerms(){
        int gcd = gcd(numerator, denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
    }
    
    static int gcd(int n, int d){  
    if (d == 0){  
        return n;
    }
    return gcd(d, n % d);  
      
    } 




}