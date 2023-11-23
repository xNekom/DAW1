package java_if;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
    	// Escribe una aplicación que solicite al usuario un número y le indique si es mayor o menor de 100.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, introduce un número: ");
        int numero = scanner.nextInt();

        if (numero > 100) {
            System.out.println("El número es mayor que 100.");
        } else if (numero < 100) {
            System.out.println("El número es menor que 100.");
        } else {
            System.out.println("El número es igual a 100.");
        }
    }
}

