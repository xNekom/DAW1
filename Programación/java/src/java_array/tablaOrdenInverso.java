package java_array;
/*
Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación, introducir
por teclado esa cantidad de números enteros, y por último, mostrar en el orden inverso al introducido.
*/

import java.util.Scanner;

public class tablaOrdenInverso {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce la cantidad de números ");
        int n = entrada.nextInt();

        int[] tabla = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca un número: ");
            tabla[i] = entrada.nextInt();
        }

        System.out.println("Los números en orden inverso son:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(tabla[i]);
        }
    }
}
