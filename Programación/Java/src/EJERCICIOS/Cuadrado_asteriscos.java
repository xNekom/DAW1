package EJERCICIOS;

/*Se precisa realizar un programa que dibuje con asteriscos un cuadrado de lado n, siendo n un número introducido por el usuario por consola.
No se precisa controlar la entrada de datos del usuario, se presupone que los datos introducidos serán correctos
Realizar con el código con 2 "For" */

import java.util.Scanner;

public class Cuadrado_asteriscos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Introduce el tamaño del lado del cuadrado:"); // Pide al usuario que introduzca el tamaño
                                                                          // del lado del cuadrado
        int n = entrada.nextInt(); // Lee el número entero que el usuario introdujo y lo guarda en la variable n

        for (int columna = 0; columna < n; columna++) { // Este bucle controla el número de columnas en el cuadrado
            for (int fila = 0; fila < n; fila++) { // Este bucle controla el número de asteriscos en cada fila
                System.out.print("*  "); // Imprime un asterisco y un espacio en la misma línea
            }
            System.out.println(); // Imprime una línea en blanco para pasar a la siguiente fila
        }
    }
}