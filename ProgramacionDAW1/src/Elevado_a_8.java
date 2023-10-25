/*Desarrolla un programa que eleve un número a 8 utilizando while*/

import java.util.Scanner;

public class Elevado_a_8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;
        int datoEntrada = 0;
        int datoPrimero = 0;

        // Pedimos al usuario que introduzca un número
        System.out.println("Introduce un número: ");
        datoEntrada = entrada.nextInt();

        // Guardamos el valor original de datoEntrada en datoPrimero
        datoPrimero = datoEntrada;

        // Mientras el contador sea menor que 8, multiplicamos datoEntrada por datoPrimero y lo imprimimos
        while (contador < 7) {
            datoEntrada = datoEntrada * datoPrimero;
            contador++;
            System.out.println(datoEntrada);
        }
    }
}
