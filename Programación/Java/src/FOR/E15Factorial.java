package FOR;

/*Pedir un número y calcular su factorial.
Ej: el factorial de 5 se denota 5! y es igual a 5x4x3x2x1=120
Usar bucle FOR*/

import java.util.Scanner;

public class E15Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int factorial = 1;
        int f = 1;
        System.out.println("Introduce un número para calcular su factorial: ");
        int num = entrada.nextInt();
        for (int i = num; i > 0; i--) {
            //f = factorial;
            //System.out.println(f+ "      ");
            factorial = factorial*i;
            System.out.println(num + "x" + factorial + "=" + num*factorial);
        }
         System.out.println("El resultado es: " + factorial);
    }
}


