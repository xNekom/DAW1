package java_ejercicios;

/*Escribe un programa que lea una lista de diez números y haga un recuento de cuántos son positivos, y cuántos son negativos. Mostrará por consola el resultado. */
import java.util.Scanner;

public class Recuento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int pos = 0;
        int neg = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un número entero: ");
            int num = entrada.nextInt();
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        System.out.println("Números positivos:  " + pos);
        System.out.println("Números negativos:  " + neg);
    }
}