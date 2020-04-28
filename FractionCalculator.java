import java.util.*;

public class FractionCalculator{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        boolean quit = false;
        Fraction first;
        Fraction second;
        Fraction ans;
        String temp;

        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("It will add, subtract, multiply, and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b where a and b are both integers.");
        while (!quit){
            System.out.print("please enter an operation");
            temp = getOperation(kb);
            System.out.println(temp);
            if (temp == "*"){
                first = getFraction(kb);
                second = getFraction(kb);
                ans = first.multiply(second);
                System.out.println(first.toString() + " * " + second.toString() + " is " + ans.toString());
            }
            else if (temp =="/"){
                first = getFraction(kb);
                second = getFraction(kb);
                ans = first.divide(second);
                System.out.println(first.toString() + " / " + second.toString() + " is " + ans.toString());

            }
            else if (temp == "+"){
                first = getFraction(kb);
                second = getFraction(kb);
                ans = first.add(second);
                System.out.println(first.toString() + " + " + second.toString() + " is " + ans.toString());
            }
            else if (temp == "-"){
                first = getFraction(kb);
                second = getFraction(kb);
                ans = first.subtract(second);
                System.out.println(first.toString() + " - " + second.toString() + " is " + ans.toString());
            }
            else if (temp == "q" || temp == "Q"){
                quit = true;
            }
            else if (temp == "="){
                first = getFraction(kb);
                second = getFraction(kb);
                if (first.equals(second)){
                    System.out.println(first.toString() + " is equal to " + second.toString());
                }
                else{
                    System.out.println(first.toString() + " is not equal to " + second.toString());
                }

            }


        }


    }
    public static String getOperation(Scanner kb){
        String valid = "+-*/=qQ";
        System.out.println("(+, -, *, /, = or Q to Quit):");
        String o = kb.nextLine();
        if (o.length() == 1 && valid.indexOf(o.substring(0,1)) >= 0){
            return o;
        }
        System.out.println("Invalid request");
        return getOperation(kb);
    }

    public static boolean validFraction(String str){
        //checks that the only input is allowed characters
        String copy = str;
        copy.replaceAll("0", "").replaceAll("1", "").replaceAll("2", "");
        copy.replaceAll("3", "").replaceAll("4", "").replaceAll("5", "");
        copy.replaceAll("6", "").replaceAll("7", "").replaceAll("8", "");
        copy.replaceAll("9", "").replaceAll("/", "").replaceAll("-", "");
        if(copy.length() > 0){
            return false;
        }
        //if negative is in the wrong place
        if (str.contains("-")){
            if (str.indexOf("-") > 0 || str.indexOf("-") == -1){
                return false;
            }
        }
        return true;
    }

    public static Fraction getFraction(Scanner kb){
        System.out.println("Please enter a fraction (a/b) or integer (a): ");
        String frac = kb.nextLine();
        int split;
        int first;
        int second;
        if (validFraction(frac)){
            if (frac.contains("/")){
                split = frac.indexOf("/");
                first = Integer.parseInt(frac.substring(0,split));
                second = Integer.parseInt(frac.substring(split +1,frac.length()));
                return new Fraction(first, second);
            }
            else{
                first = Integer.parseInt(frac);
                return new Fraction(first);
            }

        }
        System.out.print("invalid request ");
        return getFraction(kb);
    }
}