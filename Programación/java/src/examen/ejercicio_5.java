package examen;
/*
Desarrolla una función que sea capaz de "pintar" por consola un rectángulo relleno con asteriscos. La
anchura y la altura del rectángulo se le pasarán como parámetros a la función.
*/
import java.util.Scanner;

public class ejercicio_5 {
    public static void pintarRectangulo(int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pintarRectangulo(10, 3);
        }
}