package java_array;
/*
Definir una función que tome como parámetros dos tablas, la primera con los 6 números de una apuesta de la lotería,
y la segunda (ordenada) con los 6 números de la combinación ganadora.
La función devolverá el número de aciertos.
*/
import java.util.*;
public class aciertosLoteria {
    public static int aciertos(int[] apuesta, int[] combinacion) {
        int aciertos = 0;
        for (int i = 0; i < apuesta.length; i++) {
            if (Arrays.binarySearch(combinacion, apuesta[i]) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }


    public static void main(String[] args) {
        int[] apuesta = {45, 64, 31, 75, 1, 13};
        int[] combinacion = {43, 64, 65, 31, 11, 75};
        Arrays.sort(apuesta);
        Arrays.sort(combinacion);

        int aciertos = aciertos(apuesta, combinacion);

        System.out.println("El número de aciertos es: " + aciertos);
    }
}
