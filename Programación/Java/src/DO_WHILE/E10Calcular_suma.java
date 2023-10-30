package DO_WHILE;
/*Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
El jugador tendrá que introducir la solución de la suma de dos números enteros aleatorios comprendidos entre 1 y 100.
Mientras que la solución introducida sea correcta, el juego continuará.
En caso contrario el programa terminará y mostrará el número de operaciones realizadas correctamente */

import java.util.Scanner;

public class E10Calcular_suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int intento = 0;
        int resultado = 0;
        int contador = 0;
        System.out.println("Bienvenido a Cálculo mental.");
        System.out.println("Debes calcular cuál es el resultado de la suma de los siguientes números:");
        
        do {
            int num1 = (int)((Math.random() * 100) + 1);
            int num2 = (int)((Math.random() * 100) + 1);
            resultado = num1 + num2;
            System.out.println("Primer número: " + num1);
            System.out.println("Segundo número: " + num2);
            System.out.println(resultado);
            System.out.println("Introduce la solución: ");
            intento = entrada.nextInt();
            if (intento == resultado) {
                System.out.println("¡Correcto! Prueba de nuevo");
                contador++;
            }
            else {
                System.out.println("Fallaste, ¡mejor suerte la próxima vez!");
            }
        }
        while (intento == resultado);
        System.out.println("Número total de operaciones correctas: " + contador);
    }
}