package java_array;

/*
Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. Mostrar la suma
de todos los números aleatorios que se guardan en la tabla.
*/
import java.util.*;
public class tabla1 {

    public static void main(String[] args) {
        int[] tabla = new int[10];
        int suma = 0;

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
            suma += tabla[i];
        }

        System.out.println(Arrays.toString(tabla));
        System.out.println("La suma de los números aleatorios es: " + suma);
    }
}
