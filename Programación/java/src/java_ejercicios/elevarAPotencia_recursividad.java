package java_ejercicios;

import java.util.Scanner;

public class elevarAPotencia_recursividad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Pedimos al usuario que introduzca la base
        System.out.println("Introduce un número: ");
        long base = entrada.nextInt();

        // Pedimos al usuario que introduzca la potencia
        System.out.println("Introduce la potencia: ");
        long potencia = entrada.nextInt();

        long resultado = elevar(base, potencia);
        System.out.println("El resultado es: " + resultado);
    }

    /**
     * Este método recursivo realiza el cálculo real de la potencia.
     * Si la potencia es igual a cero, el método devuelve 1.
     * De lo contrario, el método llama a sí mismo con la base y la potencia reducidas en 1 y multiplica la base por el resultado de la llamada recursiva.
     * Esto se repite hasta que la potencia sea igual a cero.
     */
    public static long elevar(long base, long potencia) {
        if (potencia == 0) {
            return 1;
        } else {
            return base * elevar(base, potencia - 1);
        }
    }
}
