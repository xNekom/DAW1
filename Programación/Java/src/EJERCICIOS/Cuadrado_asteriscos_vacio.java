package EJERCICIOS;

/*Se precisa realizar un programa que dibuje con asteriscos un cuadrado de lado n, siendo n un número introducido por el usuario por consola.
No se precisa controlar la entrada de datos del usuario, se presupone que los datos introducidos serán correctos
Realizar con el código con 2 "For" */

import java.util.Scanner;

public class Cuadrado_asteriscos_vacio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño del lado del cuadrado:");
        
        int n = entrada.nextInt();

        for (int fila = 0; fila < n; fila++) { // Bucle for para iterar a través de las filas del cuadrado
            for (int columna = 0; columna < n; columna++) { // Bucle for anidado para iterar a través de las columnas del cuadrado
                if (fila == 0 || fila == n - 1 || columna == 0 || columna == n - 1) { // Si la fila o la columna actual es la primera o la última, imprime un asterisco
                    System.out.print("*  ");
                } else { // De lo contrario, imprime dos espacio en blanco
                    System.out.print("   ");
                }
            }
            System.out.println(); // Imprime una nueva línea después de cada fila
        }
    }
}
