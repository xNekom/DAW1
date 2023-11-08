package FOR;

/*Pedir un número y calcular su factorial.
Ej: el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120
Usar bucle FOR*/

import java.util.Scanner;

public class E15Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        int factorial = 1; // Inicializa la variable factorial en 1
        int f = 1; // Inicializa la variable f en 1
        System.out.println("Introduce un número para calcular su factorial: "); // Pide al usuario que introduzca un
                                                                                // número entero
        int num = entrada.nextInt(); // Lee el número entero que el usuario introdujo y lo guarda en la variable num
        for (int i = num; i > 0; i--) { // Este bucle controla el número de veces que se multiplica el factorial
            f = factorial; // Guarda el valor actual de factorial en la variable f
            factorial = factorial * i; // Multiplica el valor actual de factorial por el valor actual de i y guarda el
                                       // resultado en la variable factorial
            System.out.println("Factorial de " + (num - i + 1) + " es: " + f + " * " + i + " = " + factorial); // Imprime
                                                                                                               // el
                                                                                                               // valor
                                                                                                               // actual
                                                                                                               // de
                                                                                                               // factorial
                                                                                                               // y el
                                                                                                               // valor
                                                                                                               // actual
                                                                                                               // de i
        }
        System.out.println("El resultado es: " + factorial); // Imprime el resultado final del factorial
    }
}
