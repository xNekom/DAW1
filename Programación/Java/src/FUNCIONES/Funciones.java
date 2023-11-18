package FUNCIONES;

/*Usando una función llamada "suma", o como quieras, programa para que se pidan al usuario por consola
2 números de tipo double y se sumen en una función que devuelva como parámetro un número de tipo "double".
Debe haber una llamada a la función suma desde el método principal. */

import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        double resultado = suma(num1, num2); // Llama a la función suma y almacena el resultado en la variable resultado
        System.out.println("El resultado de la suma es: " + resultado); // Imprime el resultado de la suma
    }

    public static double suma(double num1, double num2) { // Define la función suma que toma dos parámetros num1 y num2
        return num1 + num2; // Devuelve la suma de num1 y num2
    }
}
lñkasjdfñlkasjdflñkajsdflñkajsdfklñ