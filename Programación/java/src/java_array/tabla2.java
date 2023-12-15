package java_array;
/*
Introduce por teclado un número n, a continuación solicita al usuario que teclee n números. Realiza la media de los
números positivos, la media de los negativos y cuenta el número de ceros introducidos.
*/
import java.util.Scanner;

public class tabla2 {
    public static void main(String[] args) {
        int n;
        int totalPositivos = 0;
        int totalNegativos = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int totalCeros = 0;

        System.out.println("Introduce el número de números a introducir: ");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                totalPositivos += numeros[i];
                contadorPositivos++;
            }
            else if (numeros[i] < 0) {
                totalNegativos += numeros[i];
                contadorNegativos++;
            }
            else {
                totalCeros++;
            }
        }

        double mediaPositivos = (double) totalPositivos / contadorPositivos;
        double mediaNegativos = (double) totalNegativos / contadorNegativos;

        System.out.println("La media de los positivos es: " + mediaPositivos);
        System.out.println("La media de los negativos es: " + mediaNegativos);
        System.out.println("El número de ceros introducidos es: " + totalCeros);
    }
}
