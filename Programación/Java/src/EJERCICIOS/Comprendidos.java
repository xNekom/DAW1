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

        if (num1 == num2) {
            System.out.println("Los números introducidos deben ser distintos.");
        } else {
            int menor = Math.min(num1, num2);
            int mayor = Math.max(num1, num2);

            System.out.println("Los números enteros comprendidos entre " + menor + " y " + mayor + " incrementando de 8 en 8 son:");
            for (int i = menor; i <= mayor; i += 8) {
                System.out.println(i);
            }
        }
    }
}
