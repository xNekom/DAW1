package WHILE;
/*Desarrolla un programa que mientras que los datos introducidos por consola sean pares muestre un mensaje: "número par", 
hasta que el dato introducido sea impar en el que mostrará el mensaje: "dato impar, fin del programa". */

import java.util.Scanner;

public class E6Dato_par {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int num = entrada.nextInt();
        
        while (num % 2 == 0) { 
            System.out.println("Número par");
            System.out.println("Introduce otro número: ");
            num = entrada.nextInt();
            }
            System.out.println("Dato impar, fin del programa.");
        }
    }