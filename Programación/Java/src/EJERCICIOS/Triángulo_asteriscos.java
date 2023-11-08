package EJERCICIOS;

import java.util.Scanner;

public class Triángulo_asteriscos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.print("Introduce un número entero: "); // Pide al usuario que introduzca un número entero
        int n = input.nextInt(); // Lee el número entero que el usuario introdujo y lo guarda en la variable n
        for (int columnas = n; columnas >= 1; columnas--) { // Este bucle controla el número de filas en el triángulo
            for (int filas = 1; filas <= columnas; filas++) { // Este bucle controla el número de asteriscos en cada
                                                              // fila
                System.out.print("* "); // Imprime un asterisco y un espacio en la misma línea
            }
            System.out.println(); // Imprime una línea en blanco para pasar a la siguiente fila
        }
    }
}