package examen;
/*
Desarrolla una función que sea capaz de "pintar" por consola un rectángulo vacío con asteriscos. La
anchura y la altura del rectángulo se le pasarán como parámetros a la función.
*/

public class ejercicio_6 {
    public static void pintarRectangulo(int anchura, int altura) {
            for (int i = 0; i < altura; i++) {
                for (int j = 0; j < anchura; j++) {
                    if (i == 0 || i == altura - 1 || j == 0 || j == anchura - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        pintarRectangulo(10, 3);
    }
}