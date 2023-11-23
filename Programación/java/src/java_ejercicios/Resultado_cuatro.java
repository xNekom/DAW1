package java_ejercicios;

public class Resultado_cuatro {
    public static void main(String[] args) {
        int altura = 5;
        for (int i = 0; i < altura; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 1; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < altura - i - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        System.out.println("*");
    }
}