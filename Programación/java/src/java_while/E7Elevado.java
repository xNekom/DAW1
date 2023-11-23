package java_while;
/*Elevar un número a una potencia con un bucle WHILE.
El usuario introduce la base y el exponente por consola. 
El programa debe calcular mediante un bucle WHILE el resultado de esa operación y 
mostrarnos el resultado y la cantidad de iteraciones que ha hecho en dicho bucle.*/

import java.util.Scanner;

public class E7Elevado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int resultado = 1; // Establecemos variable resultado en 1
        int contador = 0; // Añadimos un contador para las iteraciones

        // Pedimos al usuario que introduzca la base
        System.out.println("Introduce un número: ");
        int base = entrada.nextInt();

        // Pedimos al usuario que introduzca la potencia
        System.out.println("Introduce la potencia: ");
        int potencia = entrada.nextInt();

        // Mientras el contador sea menor que la potencia, multiplicamos resultado por base
        while (contador < potencia) {
            resultado = resultado * base;
            contador++;
            System.out.println("Iteración " + contador + ": " + resultado);
        }
        System.out.println("Número total de iteraciones: " + contador);
    }
}
