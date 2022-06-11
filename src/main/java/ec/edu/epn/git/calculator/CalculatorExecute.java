package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("** Calculator Execute **");

        Calculator c = new Calculator();
        int addition = c.suma(4,7);
        System.out.println("c.suma(4,7) = " + addition);

        int subtraction = c.resta(7,1);
        System.out.println("c.resta(7,1) = " + subtraction);

    }

}
