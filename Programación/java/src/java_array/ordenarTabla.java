package java_array;
/*
Escribir la función int[ ] rellenaPares(int longitud, int fin), que crea y devuelve una tabla ordenada de la longitud
especificada, que se encuentra rellena con números pares aleatorios comprendidos en el rango desde 2 hasta 'fin'
(inclusive)
*/
import java.util.*;

public class ordenarTabla {

    public static int[] rellenaPares(int longitud, int fin) {
        int[] tabla = new int[longitud];
        int i = 0;

        while (i < tabla.length) {
            int num = (int) (Math.random() * fin + 1);
            if (num % 2 == 0) {
                tabla[i] = num;
                i++;
            }
        }

        Arrays.sort(tabla);
        return tabla;
    }


    public static void main(String[] args) {
        int[] tablaPares = rellenaPares(10, 20);
        System.out.println(Arrays.toString(tablaPares));
        }

    }
