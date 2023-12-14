package java_array;

/*
Crear una tabla de longitud 10 que se inicializará con números aleatorios comprendidos entre 1 y 100. Mostrar la suma
de todos los números aleatorios que se guardan en la tabla.
*/
public class tabla1 {

    public static void main(String[] args) {
        int[] tabla = new int[10];

        for (int i = 0; i < tabla.length; i++) {
            tabla[i] = (int) (Math.random() * 101);
            System.out.print(tabla[i] + " ");
        }
        System.out.println();

        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i];
        }

        System.out.println("La suma de los números aleatorios es: " + suma);
    }
}
