package java_do_while;
/*Desarrollar un juego que ayude a mejorar el cálculo mental de la suma.
El jugador tendrá que introducir la solución de la suma de dos números enteros aleatorios comprendidos entre 1 y 100.
Mientras que la solución introducida sea correcta, el juego continuará.
En caso contrario el programa terminará y mostrará el número de operaciones realizadas correctamente */

import java.util.Scanner;

public class E10Calcular_suma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario

        int intento = 0; // Inicializa la variable intento
        int resultado = 0; // Inicializa la variable resultado
        int contador = 0; // Inicializa la variable contador
        System.out.println("Bienvenido a Cálculo mental."); // Imprime un mensaje de bienvenida
        System.out.println("Debes calcular cuál es el resultado de la suma de los siguientes números:"); // Indica al
                                                                                                         // usuario que
                                                                                                         // debe
                                                                                                         // calcular la
                                                                                                         // suma de dos
                                                                                                         // números
                                                                                                         // aleatorios

        do { // Inicia un bucle do-while
            int num1 = (int) ((Math.random() * 100) + 1); // Genera un número aleatorio entre 1 y 100 y lo guarda en la
                                                          // variable num1
            int num2 = (int) ((Math.random() * 100) + 1); // Genera otro número aleatorio entre 1 y 100 y lo guarda en
                                                          // la variable num2
            resultado = num1 + num2; // Calcula la suma de los dos números aleatorios y lo guarda en la variable
                                     // resultado
            System.out.println("Primer número: " + num1); // Imprime el primer número aleatorio
            System.out.println("Segundo número: " + num2); // Imprime el segundo número aleatorio
            System.out.println(resultado); // Imprime la suma de los dos números aleatorios
            System.out.println("Introduce la solución: "); // Pide al usuario que introduzca la solución
            intento = entrada.nextInt(); // Lee la solución que el usuario introdujo y la guarda en la variable intento
            if (intento == resultado) { // Verifica si la solución es correcta
                System.out.println("¡Correcto! Prueba de nuevo"); // Imprime un mensaje de felicitación si la solución
                                                                  // es correcta
                contador++; // Incrementa el contador de operaciones correctas
            } else {
                System.out.println("Fallaste, ¡mejor suerte la próxima vez!"); // Imprime un mensaje de error si la
                                                                               // solución es incorrecta
            }
        } while (intento == resultado); // Continúa el bucle do-while mientras la solución sea correcta
        System.out.println("Número total de operaciones correctas: " + contador); // Imprime el número total de
                                                                                  // operaciones correctas
    }
}
