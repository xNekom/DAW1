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
        Scanner scanner = new Scanner(System.in);
        int[] valoresLetras;
        valoresLetras = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27};
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        int totalPuntos = 0;

        while (totalPuntos != 100) {
            System.out.println("Introduce una palabra:");
            String palabra = scanner.nextLine();

            int puntosPalabra = 0;
            for (int i = 0; i < palabra.length(); i++) {
                char letra = palabra.charAt(i);
                int indiceLetra = alfabeto.indexOf(letra);
                int valorLetra = valoresLetras[indiceLetra];
                puntosPalabra = puntosPalabra + valorLetra;
            }

            totalPuntos = puntosPalabra;
            System.out.println("Los puntos de la palabra " + palabra + " son: " + puntosPalabra);

            if (totalPuntos == 100) {
                System.out.println("¡Felicidades! Has alcanzado los 100 puntos.");
            } else {
                System.out.println("Tu puntuación es de " + totalPuntos + " puntos. Sigue intentándolo.");
            }
        }
    }
}
