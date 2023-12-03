package ejercicios_mouredev;

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */
public class Reto0 {
    public static void main(String[] args) {
        int num = 1;

        while (num >= 1 && num <= 100) {

            if (num % 3 == 0) {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println("fizz");
                }
            } else if (num % 5 == 0) {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println("fizz");
                }
            } else {
                System.out.println(num);
            }
            num++;
        }
    }
}