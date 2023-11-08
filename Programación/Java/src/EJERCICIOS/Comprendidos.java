package EJERCICIOS;

/*Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
 el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 8 en 8. */

import java.util.Scanner;

public class Comprendidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el primer número entero:");
        int num1 = entrada.nextInt();

        System.out.println("Introduce el segundo número entero:");
        int num2 = entrada.nextInt();

        if (num1 == num2) { // Verificamos si los números son iguales
            System.out.println("Los números introducidos deben ser distintos."); // Imprimimos un mensaje de error si
                                                                                 // los números son iguales
        } else {
            int menor, mayor;
            if (num1 < num2) { // Si el primer número es menor que el segundo
                menor = num1; // El primer número es el menor
                mayor = num2; // El segundo número es el mayor
            } else { // Si el segundo número es menor que el primero
                menor = num2; // El segundo número es el menor
                mayor = num1; // El primer número es el mayor
            }

            System.out.println("Los números enteros comprendidos entre " + menor + " y " + mayor
                    + " incrementando de 8 en 8 son:"); // Imprimimos un mensaje que indica qué números se van a mostrar

            for (int i = menor; i <= mayor; i += 8) { // Iniciamos un ciclo for que va desde el número menor hasta el
                                                      // número mayor, incrementando de 8 en 8
                System.out.println(i); // Mostramos el número actual
            }
        }
    }
}
