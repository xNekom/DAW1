package java_for;

/*Pedir un número y calcular su factorial.
Ej: el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120
Usar bucle FOR*/

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        int factorial = 1;
        for(int i = num; i > 0; i--) {
            factorial *= i;
        }
        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
