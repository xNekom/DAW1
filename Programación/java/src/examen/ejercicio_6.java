package examen;

import java.util.Scanner;

public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el tamaño de anchura: ");
        int anchura = entrada.nextInt();
        System.out.println("Introduce el tamaño de altura: ");
        int altura = entrada.nextInt();


        for (int fila = 0; fila < altura; fila++) { // Bucle for para iterar a través de las filas del cuadrado
            for (int columna = 0; columna < anchura; columna++) { // Bucle for anidado para iterar a través de las columnas
                // del cuadrado
                if (fila == 0 ||  fila == altura -1 || columna == 0 || columna == anchura - 1) { // Si la fila o la columna actual
                    // es la primera o la última,
                    // imprime un asterisco
                    System.out.print("*");
                } else { // De lo contrario, imprime dos espacio en blanco
                    System.out.print(" ");
                }
            }
            System.out.println(); // Imprime una nueva línea después de cada fila
        }
    }
}
