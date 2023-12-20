package java_array;
/*Leer y almacenar 'n' números enteros en una tabla, a partir de la que se construirán otras dos tablas con los elementos
con valores pares e impares de la primera, respectivamente. Las tablas pares e impares deben mostrarse ordenadas.
*/

import java.util.Arrays;
import java.util.Scanner;

public class tablasParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números a leer: ");
        int n = entrada.nextInt();
        int[] numeros = new int[n];
        int[] pares = new int[n];
        int[] impares = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 == 0) {
                pares[i] = numeros[i];
            } else {
                impares[i] = numeros[i];
            }
        }
        Arrays.sort(pares);
        Arrays.sort(impares);
        System.out.println("Números pares:");
        for (int i = 0; i < n; i++) {
            if (pares[i] != 0) {
                System.out.print(pares[i] + " ");
            }
        }
        System.out.println("\nNúmeros impares:");
        for (int i = 0; i < n; i++) {
            if (impares[i] != 0) {
                System.out.print(impares[i] + " ");
            }
        }
    }
}
