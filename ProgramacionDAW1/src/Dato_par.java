/*Desarrolla un programa que mientras que los datos introducidos por consola sean pares muestre un mensaje: "número par", 
hasta que el dato introducido sea impar en el que mostrará el mensaje: "dato impar, fin del programa". */

import java.util.Scanner;

public class Dato_par {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");

        while (true) {
            int num = entrada.nextInt();
            if (num % 2 == 0) {
                System.out.println("Número par");
                System.out.println("Introduce otro número: ");
            } else {
                System.out.println("Dato impar, fin del programa");
                break;
            }
        }
        entrada.close();
    }
}
