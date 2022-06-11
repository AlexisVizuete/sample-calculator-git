package ec.edu.epn.git.calculator;

public class Calculator {

    private int respuesta;

    public int suma(int a, int b) {
        return a + b;
    }

    public int resta(int a, int b) {
        return a - b;
    }

    @SuppressWarnings("IntegerDivisionInFloatingPointContext")
    public double division(int a, int b) {
        return a / b;
    }

    //Metodo nuevo para realizar una multiplicacion
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    public void timeout(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

}
