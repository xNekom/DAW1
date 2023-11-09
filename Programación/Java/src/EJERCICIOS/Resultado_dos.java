package EJERCICIOS;

public class Resultado_dos {
    public static void main(String[] args) {
        int escalones = 3; // número de escalones que queremos dibujar
        int alturaEscalon = 2; // altura de cada escalón

        for (int i = 1; i <= escalones; i++) { // bucle para dibujar cada escalón
            for (int j = 1; j <= alturaEscalon; j++) { // bucle para dibujar cada fila de asteriscos en cada escalón
                for (int k = 0; k < i; k++) { // bucle para dibujar una fila de asteriscos para cada escalón
                    System.out.print("***"); // dibuja una fila de asteriscos
                }
                System.out.println(); // salta a la siguiente línea
            }
        }
    }
}
