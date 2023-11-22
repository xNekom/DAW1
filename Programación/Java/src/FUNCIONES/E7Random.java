package FUNCIONES;

/*Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios. */

import java.util.*;

public class E7Random {
    public static void main(String[] args) {
        int contador = 0;
        while (contador < 20) {
            int numeroAleatorio = (int) (Math.random() * 11);
            System.out.print(numeroAleatorio + " ");
            contador++;
        }
    }
}