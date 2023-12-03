package ejercicios_mouredev;

/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */
public class Reto2 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        System.out.println(a);
        System.out.println(b);
        for (long i = 2; i <= 50; i++) {
            long siguiente = a + b;
            System.out.println(siguiente);
            a = b;
            b = siguiente;
        }
    }
}