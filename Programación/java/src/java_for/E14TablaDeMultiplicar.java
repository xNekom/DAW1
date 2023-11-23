package java_for;

/*Implementar una aplicación que pida al usuario un número comprendido entre 1 y 10.
Hay que mostrar la tabla de multiplicar de dicho número, asegurándose de que el número introducido
se encuentra en el rango establecido, es decir, seguirá pidiendo números al usuario hasta que introduzca
uno que esté entre esos valores para mostrarle dicha tabla de multiplicar. 
Por ejemplo:
Introduce un valor entre 1 y 10
32
Introduce un valor entre 1 y 10
2
La tabla de multiplicar del 2 es:
2x0=0
2x1=2
2x2=4
.
.
.
2x10=20 */

import java.util.Scanner;

public class E14TablaDeMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario
        int num; // Declara la variable num
        do { // Inicia un bucle do-while
            System.out.println("Introduce un valor entre 1 y 10"); // Pide al usuario que introduzca un número entre 1 y
                                                                   // 10
            num = entrada.nextInt(); // Lee el número que el usuario introdujo y lo guarda en la variable num
        } while (num < 1 || num > 10); // Continúa el bucle do-while mientras el número introducido no esté entre 1 y
                                       // 10

        System.out.println("La tabla de multiplicar del " + num + " es:"); // Imprime un mensaje que indica la tabla de
                                                                           // multiplicar que se va a imprimir
        for (int i = 0; i <= 10; i++) { // Este bucle controla el número de veces que se imprime la tabla de multiplicar
            System.out.println(num + " x " + i + " = " + num * i); // Imprime la tabla de multiplicar
        }
    }
}
