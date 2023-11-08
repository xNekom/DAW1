package EJERCICIOS;

/*Se precisa realizar un programa que dibuje con asteriscos un cuadrado de lado n, siendo n un número introducido por el usuario por consola.
No se precisa controlar la entrada de datos del usuario, se presupone que los datos introducidos serán correctos
Realizar con el código con 2 "For" */

import java.util.Scanner;

public class Cuadrado_asteriscos {
   public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.println("Introduce el tamaño del lado del cuadrado:");
       int n = entrada.nextInt();


       for (int columna = 0; columna < n; columna++) {
           for (int fila = 0; fila < n; fila++) {
               System.out.print("* ");
           }
           System.out.println();
       }
   }
}

