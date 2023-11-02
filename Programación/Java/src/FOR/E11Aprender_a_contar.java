package FOR;

/*Escribe una aplicación que pida un número por consola y muestre todos los números de 1 a n
Usar el bucle FOR */

import java.util.Scanner;

public class E11Aprender_a_contar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = entrada.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
