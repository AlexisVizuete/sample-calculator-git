package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("** Calculator Execute **");

        Calculator c = new Calculator();
        int addition = c.suma(4,7);
        System.out.println("c.suma(4,7) = " + addition);

        int subtraction = c.resta(7,1);
        System.out.println("c.resta(7,1) = " + subtraction);

        System.out.println("** Esto es un cambio **");

        int multiplication = c.multiplicacion(11, 2);
        System.out.println("c.multiplicacion(11, 2) = " + multiplication);

        System.out.println("** Esto es otro cambio **");

    }

}
