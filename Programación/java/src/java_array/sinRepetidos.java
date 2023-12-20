package java_array;
/*
Implementar la función: int[] sinRepetidos(int t[]), que construye y devuelve una tabla de la longitud apropiada,
con los elementos de t, donde se han eliminado los datos repetidos
*/

import java.util.Arrays;

public class sinRepetidos {
    public static void main(String[] args) {
        int[] t = {1, 2, 3, 2, 4, 1, 5, 6, 5};
        t = sinrepetidos(t);
        System.out.println("Números introducidos sin repetición:");
        System.out.print(Arrays.toString(t));
    }

    public static int[] sinrepetidos(int[] t) {
        int[] sinRepetidos = new int[t.length];
        int j = 0;
        for (int i = 0; i < t.length; i++) {
            boolean repetido = false;
            for (int k = 0; k < j; k++) {
                if (t[i] == sinRepetidos[k]) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                sinRepetidos[j] = t[i];
                j++;
            }
        }
        return Arrays.copyOf(sinRepetidos, j);
    }
}
