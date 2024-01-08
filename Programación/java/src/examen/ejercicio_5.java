package examen;

import java.util.Scanner;

public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.print("Introduce la anchura: ");
        int anchura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}