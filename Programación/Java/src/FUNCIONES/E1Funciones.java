package FUNCIONES;

/*Usando una función llamada "suma", o como quieras, programa para que se pidan al usuario por consola
2 números de tipo double y se sumen en una función que devuelva como parámetro un número de tipo "double".
Debe haber una llamada a la función suma desde el método principal. */

import java.util.Scanner;

public class E1Funciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        double resultado = suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }
}
