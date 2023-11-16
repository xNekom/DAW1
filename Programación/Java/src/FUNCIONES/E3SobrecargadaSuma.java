package FUNCIONES;

/*Crea una función sobrecarga de la función "suma" que calcule la suma de todos los números enteros menores de un número dado hasta el cero. También con los negativos. Debe devolver el resultado de la operación, no mostrarlo por consola.
Añádela al código anterior

Ej: a la función le paso un 4 y me devuelve un 10 (4+3+2+1);
Ej: -3  --> -6 (-3 + -2 + -1)*/

import java.util.Scanner;

public class E3SobrecargadaSuma {
    public static double suma(double num1, double num2) { // Define la función suma que toma dos parámetros num1 y num2
        return num1 + num2; // Devuelve la suma de num1 y num2
    }

    public static int suma(int numero) {
        int resultado = 0;
        for (int i = numero; i >= 0; i--) {
            resultado += i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        System.out.println("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        double resultado = suma(num1, num2); // Llama a la función suma y almacena el resultado en la variable resultado
        System.out.println("El resultado de la suma es: " + resultado); // Imprime el resultado de la suma
    }
}
