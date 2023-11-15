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
        System.out.println("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
        double resultado = suma(num1, num2); // Llama a la función suma y almacena el resultado en la variable resultado
        System.out.println("El resultado de la suma es: " + resultado); // Imprime el resultado de la suma
        parImpar((int)resultado); // Llama a la función parImpar y le pasa el resultado de la suma
    }

    public static double suma(double num1, double num2) { // Define la función suma que toma dos parámetros num1 y num2
        return num1 + num2; // Devuelve la suma de num1 y num2
    }

    public static void parImpar(double num) { // Define la función parImpar que toma un parámetro num
        if (num % 2 == 0) { // Si el residuo de la división de num entre 2 es 0, entonces es par
            System.out.println("El resultado es par.");
        } else { // De lo contrario, es impar
            System.out.println("El resultado es impar.");
        }
    }
}

