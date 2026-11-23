
import java.util.Scanner;

/**
 * Calculadora JOKER.
 * Realiza operaciones matematicas basicas.
 */
public class Ca {

    // Variables globales
    static Scanner sc = new Scanner(System.in);
    static int a, b, v;
    static double r;
    static String s;

    /**
     * Funcion de division.
     * Se encuentra desactivada porque la division
     * no esta permitida entre las operaciones solicitadas.
     *
     * @return resultado de la division
     */
    /*
    static double dv() {
        return (double) a / b;
    }
    */

    /**
     * Lee un numero entero comprendido entre -99999 y 99999.
     *
     * @return numero entero validado
     */
    static int le() {
        while (true) {
            System.out.print("Introduce un numero: ");
            s = sc.nextLine();

            try {
                v = Integer.parseInt(s);

                if (v >= -99999 && v <= 99999) {
                    return v;
                }
            } catch (NumberFormatException e) {
                // Entrada no valida
            }

            System.out.println("Error: introduce un entero entre -99999 y 99999.");
        }
    }

    /**
     * Realiza la suma.
     */
    static void sm() {
        r = (double) a + b;
    }

    /**
     * Realiza la resta.
     */
    static void rs() {
        r = (double) a - b;
    }

    /**
     * Realiza la multiplicacion.
     */
    static void ml() {
        r = (double) a * b;
    }

    /**
     * Realiza la potencia.
     */
    static void pt() {
        r = Math.pow(a, b);
    }

    /**
     * Metodo principal del programa.
     *
     * @param ar argumentos de ejecucion
     */
    public static void main(String[] ar) {

        System.out.println("CALCULADORA JOKER");

        a = le();
        b = le();

        sm();
        System.out.println("Suma: " + r);

        rs();
        System.out.println("Resta: " + r);

        ml();
        System.out.println("Multiplicacion: " + r);

        pt();
        System.out.println("Potencia: " + r);
    }
}
