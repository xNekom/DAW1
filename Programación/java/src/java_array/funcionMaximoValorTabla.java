package java_array;

/*
Diseñar la función: int maximo(int t[]), que devuelva el máximo valor contenido en la tabla 't'
*/
public class funcionMaximoValorTabla {

    static int maximo(int tabla[]) {
        int max = tabla[0];
        for (int posicion : tabla) {
            if (posicion > max) {
                max = posicion;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {45, 142, 32, 4, 52};
        int resultado = maximo(array);
        System.out.println("El máximo valor del arreglo es: " + resultado);
    }
}