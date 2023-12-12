package ejercicios_mouredev;
/*
 * La última semana de 2021 comenzamos la actividad de retos de programación,
 * con la intención de resolver un ejercicio cada semana para mejorar
 * nuestra lógica... ¡Hemos llegado al EJERCICIO 100! Gracias 🙌
 *
 * Crea un programa que calcule los puntos de una palabra.
 * - Cada letra tiene un valor asignado. Por ejemplo, en el abecedario
 *   español de 27 letras, la A vale 1 y la Z 27.
 * - El programa muestra el valor de los puntos de cada palabra introducida.
 * - El programa finaliza si logras introducir una palabra de 100 puntos.
 * - Puedes usar la terminal para interactuar con el usuario y solicitarle
 *   cada palabra.
 */

import java.util.Scanner;

public class Reto100 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int puntos = 0;
        String palabra = "";

        while (puntos != 100) {

            System.out.print("Introduce una palabra: ");
            palabra = entrada.next();

            String copiaPalabra = palabra.toUpperCase();

            for (int i = 0; i < copiaPalabra.length(); i++) {
                int puntosLetra = 0;
                for (int j = 65; j <= 90; j++) { // Empieza en la A y termina en la Z (en ASCII)
                    puntosLetra++;
                    if (copiaPalabra.charAt(i) == j) {
                        puntos = puntos + puntosLetra;
                        break;
                    } else if (copiaPalabra.charAt(i) == 'Ñ') {
                        puntos = puntos + 15;
                        break;
                    }
                    if (j == 78) { // Cuando llega a la Ñ
                        puntosLetra++;
                    }
                }
            }
            System.out.println("La palabra " + palabra + " vale " + puntos + " puntos");
            if (puntos != 100) {

                puntos = 0;
            }
        }
        System.out.println("¡ENHORABUENA!");
        entrada.close();
    }
}