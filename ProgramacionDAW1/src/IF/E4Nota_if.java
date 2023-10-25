package IF;
/*Dada una nota numérica entre 0 y 10 por consola, se pide hacer un programita que en función de ese valor numérico muestre un mensaje al usuario:
-Si el valor de la nota está entre 0 y 4 mostrará por consola. Suspenso
-Si el valor de la nota está entre 5 y 8 mostrará por consola: Aprobado
-Si el valor de la nota está entre 9 y 10 mostrará por consola: Sobresaliente*/

import java.util.Scanner;

public class E4Nota_if {
    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);

        // Preguntar al usuario
        System.out.println("Introduce la nota: ");
        nota = entrada.nextInt();

        // Establecer condicionales
        if (nota >= 0 && nota <= 4) {
            System.out.println("Suspenso");
        } else if (nota >= 5 && nota <= 8) {
            System.out.println("Aprobado");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("Introduce un valor del 0 al 10");
        }
    }
}
