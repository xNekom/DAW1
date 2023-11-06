package EJERCICIOS;

import java.util.Scanner;

public class Triángulo_asteriscos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n = input.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int h = 1; h <= i; h++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
