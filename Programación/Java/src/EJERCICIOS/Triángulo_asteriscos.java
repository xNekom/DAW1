package EJERCICIOS;

import java.util.Scanner;

public class Triángulo_asteriscos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = input.nextInt();
        for (int columnas = n; columnas >= 1; columnas--) {
            for (int filas = 1; filas <= columnas; filas++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
