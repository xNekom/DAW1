package java_array;
/*
Crea una tabla de 10 elementos y muestra todos sus elementos usando tres maneras diferentes:
- System.out.println(Arrays.toString('tabla');
- Con un 'for'
- Con un 'for' extendido
*/
import java.util.*;
public class tabla3 {
    public static void main(String[] args) {
        int[] tabla = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 100 + 1);
        }
        System.out.println(Arrays.toString(tabla));

        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i] + " ");
        }
        System.out.println();
        for (int posicion : tabla){
            System.out.print(posicion + " ");
        }
    }
}