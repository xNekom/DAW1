package EJERCICIOS;

/*Dado el siguiente código, ¿cuál es el resultado en consola?*/

public class Resultado_uno {
    public static void main(String[] args) {
        int alturaIntroducida = 4; // Altura de la pirámide
        int altura = 1; // Altura actual de la pirámide
        int i = 0; // Variable de control para los ciclos for
        int espacios = alturaIntroducida - 1; // Número de espacios en la primera línea

        while (altura <= alturaIntroducida) { // Ciclo while que se ejecuta mientras la altura actual sea menor o igual
                                              // a la altura de la pirámide
            for (i = 1; i <= espacios; i++) { // Ciclo for que imprime los espacios en la línea actual
                System.out.print("*"); // Imprime un asterisco
            }
            for (i = 1; i < altura; i++) { // Ciclo for que imprime los números en la línea actual
                System.out.print(i); // Imprime el número actual
            }
            for (i = altura; i > 0; i--) { // Ciclo for que imprime los números en orden inverso en la línea actual
                System.out.print(i); // Imprime el número actual
            }
            System.out.println(); // Imprime un salto de línea
            altura++; // Incrementa la altura actual
            espacios--; // Decrementa el número de espacios en la siguiente línea
        }
    }
}

/*Este programa imprime una pirámide de números y asteriscos*/