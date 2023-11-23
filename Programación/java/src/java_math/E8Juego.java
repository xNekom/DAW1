package java_math;
/*Desarrolla un código que recree el juego "número secreto" que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). 
Para ello se introduce por teclado una serie de números para los que el programa nos da la pista si el número a acertar es mayor o menor.
El proceso termina cuando el usuario acierta el número o cuando se rinde (introduciendo un -1 para rendirse).*/

import java.util.Scanner;

public class E8Juego {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroSecreto = (int)(Math.random() * 100);
        int intento;
        
        System.out.println("¡Comienza el juego!");
        System.out.println("Tienes que adivinar el número secreto, este se encuentra entre 0 y 99.");
        System.out.println("Si en algún momento quieres rendirte, introduce '-1'");
        System.out.println("Introduce un número: ");
        intento = entrada.nextInt();

        while (numeroSecreto != intento) {
            if (intento == -1) {
                System.out.println("Has abandonado.");
                break;
            }
            else if (numeroSecreto < intento) {
                System.out.println("El número introducido es menor.");
                System.out.println("Introduce otro número: ");
                intento = entrada.nextInt();
            }
            else if (numeroSecreto > intento) {
                    System.out.println("El número introducido es mayor.");
                    System.out.println("Introduce otro número: ");
                    intento = entrada.nextInt();
            }
        }

        if (numeroSecreto == intento) {
            System.out.println("¡Felicidades! Has adivinado el número secreto.");
        }
    }
}
