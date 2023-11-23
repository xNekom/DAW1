package java_for;

/*Escribe una aplicación que pida un número por consola y muestre todos los números de 1 a n
Usar el bucle FOR */

import java.util.Scanner;

public class E11Aprender_a_contar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Introduce un número: "); // Pide al usuario que introduzca un número
        int num = entrada.nextInt(); // Lee el número que el usuario introdujo y lo guarda en la variable num
        for (int i = 1; i <= num; i++) { // Este bucle controla el número de veces que se imprime un número
            System.out.println(i); // Imprime el número actual
        }
    }
}
