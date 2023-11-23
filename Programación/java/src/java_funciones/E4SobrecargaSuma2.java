package java_funciones;

/*Añade un método nuevo en tu código llamado suma y dale la funcionalidad que a tí se te ocurra, recuerda que éste será el tercer método/función que se llama igual.
Una vez terminado, escribe el código necesario para usar este método y el del apartado anterior que también se llama 'suma'.
Añade en los comentarios cuál es la funcionalidad de tu método y lo que hace el código añadido. */

import java.util.Scanner;

public class E4SobrecargaSuma2 {
    // Método que suma dos números de tipo double y devuelve el resultado
    public static double suma(double num1, double num2) {
        return num1 + num2;
    }

    // Método que suma todos los números enteros desde el número dado hasta 0
    public static int suma(int numero) {
        int resultado2 = 0;
        for (int i = numero; i >= 0; i--) {
            resultado2 += i;
        }
        return resultado2;
    }

    // Método que multiplica dos números de tipo int y devuelve el resultado
    public static int suma(int num3, int num4) {
        return num3 * num4;
    }

    // Método principal donde se ejecuta el programa
    public static void main(String[] args) {
        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner entrada = new Scanner(System.in);
        // Solicita al usuario que introduzca el primer número
        System.out.println("Introduce el primer número: ");
        // Lee el primer número introducido por el usuario
        double num1 = entrada.nextDouble();
        // Solicita al usuario que introduzca el segundo número
        System.out.println("Introduce el segundo número: ");
        // Lee el segundo número introducido por el usuario
        double num2 = entrada.nextDouble();
        // Llama al método suma que suma dos números de tipo double
        double resultado = suma(num1, num2);
        // Muestra el resultado de la suma
        System.out.println("El resultado de la suma es: " + resultado);

        // Solicita al usuario que introduzca un número para calcular la suma de todos
        // los números enteros menores que el introducido
        System.out.println(
                "\nIntroduce un número para calcular la suma de todos los números enteros menores que el introducido: ");
        // Lee el número introducido por el usuario
        int numero = entrada.nextInt();
        // Llama al método suma que suma todos los números enteros desde el número dado
        // hasta 0
        int resultado2 = suma(numero);
        // Muestra el resultado de la suma
        System.out.println("El resultado es: " + resultado2);

        // Solicita al usuario que introduzca el primer número a sumar
        System.out.println("\nIntroduce el primer número a sumar: ");
        // Lee el primer número introducido por el usuario
        int num3 = entrada.nextInt();
        // Solicita al usuario que introduzca el segundo número a sumar
        System.out.println("Introduce el segundo número a sumar: ");
        // Lee el segundo número introducido por el usuario
        int num4 = entrada.nextInt();
        // Llama al método suma que multiplica dos números de tipo int
        int resultado3 = suma(num3, num4);
        // Muestra el resultado de la multiplicación
        System.out.println("Te he troleado, no era una suma, es una multiplicación y el resultado es: " + resultado3);
    }
}