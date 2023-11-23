package java_ejercicios;

/*Dado el siguiente código, ¿cuál es el resultado en consola?*/

import java.util.*;

public class Resultado_tres {
    public static void main(String[] args) {
        int numero = -1; // Inicializamos la variable numero con -1
        Scanner entrada = new Scanner(System.in);

        while (numero != -1) { // Ciclo while que se ejecuta mientras el número ingresado por el usuario no sea
                               // -1
            System.out.println("Introduce un número"); // Pedimos al usuario que ingrese un número
            numero = entrada.nextInt();

            if (numero > 50) { // Si el número ingresado es mayor que 50
                System.out.println("tu número es mayor que 50"); // Imprimimos un mensaje indicando que el número es
                                                                 // mayor que 50
            } else if (numero < 50) { // Si el número ingresado es menor que 50
                System.out.println("tu número es menor que 50"); // Imprimimos un mensaje indicando que el número es
                                                                 // menor que 50
            } else if (numero == 50) { // Si el número ingresado es igual a 50
                System.out.println("tu número es igual a 50"); // Imprimimos un mensaje indicando que el número es igual
                                                               // a 50
            }
        }
        System.out.print("fin del programa"); // Imprimimos un mensaje indicando que el programa ha terminado
    }
}

/*
 * Este programa imprime si los números introducidos por el usuario son mayores
 * que 50. El programa terminará cuando el usuario introduzca un “-1”.
 */