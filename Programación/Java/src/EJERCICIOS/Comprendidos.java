package EJERCICIOS;

/*Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos,
 el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 8 en 8. */

import java.util.Scanner;

public class Comprendidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        System.out.println("Introduce el primer número entero:"); // Pide al usuario que introduzca el primer número entero
        int num1 = entrada.nextInt(); // Lee el número entero que el usuario introdujo y lo guarda en la variable num1
        System.out.println("Introduce el segundo número entero:"); // Pide al usuario que introduzca el segundo número entero
        int num2 = entrada.nextInt(); // Lee el número entero que el usuario introdujo y lo guarda en la variable num2

        if (num1 == num2) { // Verifica si los números son iguales
            System.out.println("Los números introducidos deben ser distintos."); // Imprime un mensaje de error si los números son iguales
        } else {
            int menor = Math.min(num1, num2); // Encuentra el número menor
            int mayor = Math.max(num1, num2); // Encuentra el número mayor

            System.out.println("Los números enteros comprendidos entre " + menor + " y " + mayor + " incrementando de 8 en 8 son:"); // Imprime un mensaje que indica los números enteros comprendidos entre los números introducidos
            for (int i = menor; i <= mayor; i += 8) { // Este bucle controla el número de números enteros que se imprimen
                System.out.println(i); // Imprime el número entero actual
            }
        }
    }
}
