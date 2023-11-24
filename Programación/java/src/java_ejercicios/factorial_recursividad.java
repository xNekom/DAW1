package java_ejercicios;

import java.util.Scanner;

public class factorial_recursividad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Introduce un número para calcular su factorial: "); // Pide al usuario que introduzca un
        // número entero
        int num = entrada.nextInt(); // Lee el número entero que el usuario introdujo y lo guarda en la variable num
        int resultado = recursividad(num); // Llama a la función recursividad y guarda el resultado en la variable resultado
        System.out.println("El resultado es: " + resultado); // Imprime el resultado final del factorial
    }

    public static int recursividad(int n) {
        if (n == 0) { // Si n es igual a 0, devuelve 1
            return 1;
        } else { // Si n no es igual a 0, llama a la función recursividad con n-1 y multiplica el resultado por n
            return n * recursividad(n - 1);
        }
    }
}
