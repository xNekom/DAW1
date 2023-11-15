package FUNCIONES;
/*Seguimos con el código anterior. Hemos hecho una función que sabe sumar (o multiplicar) y nos devuelve el resultado de la operación.
Hemos hecho una función que nos muestra por consola si un número es par o impar.

Ayúdate de ambas funciones (desde el método main) para saber si la suma de dos números pedidos por consola es par o impar (quitando la parte decimal).*/

import java.util.Scanner;

public class E3Par_Impar_NOTA {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        double num1 = entrada.nextDouble();
        parImpar((int) num1);
        System.out.println("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        parImpar((int) num2);
        double resultado = suma(num1, num2);
        System.out.println("El resultado de la suma es: " + resultado);
        parImpar((int)resultado);

    }

    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    public static void parImpar(double num) {
        if (num % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número impar.");
        }
    }

}