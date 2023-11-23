package java_ejercicios;

public class resueltoCinco {

    public static void main(String[] args) {

        int altura = 5;
        int espacios = 0;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < altura - i; j++) {
                System.out.print("*");
            }

            System.out.println();

            espacios++;
        }
    }

}