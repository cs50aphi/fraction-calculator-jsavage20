import java.util.*;

public class FractionCalculator{

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        boolean quit = false;
        Fraction first;
        Fraction second;
        String temp;

        System.out.println("Welcome to the Fraction Calculator!");
        System.out.println("It will add, subtract, multiply, and divide fractions until you type Q to quit.");
        System.out.println("Please enter your fractions in the form a/b where a and b are both integers.");
        while (!quit){
            System.out.print("please enter an operation");
            temp = getOperation(kb);
            if (temp == "*"){
                
            }
            else if (temp =="/"){
                
            }
            else if (temp == "+"){
                
            }
            else if (temp == "-"){
                
            }
            else if (temp == "q" || temp == "Q"){
                quit = true;
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
}