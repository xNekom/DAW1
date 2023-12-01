package java_ejercicios;

import java.util.Scanner;

public class Recangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la altura: ");
        int altura = sc.nextInt();
        System.out.print("Introduce la anchura: ");
        int anchura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}