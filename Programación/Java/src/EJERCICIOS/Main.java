package EJERCICIOS;

/*Escribe un programa que muestre por pantalla todos los números enteros positivos menores a uno leído por teclado
que no sean divisibles entre otro también leído de igual forma.
El que sea divisible quiere decir que la división de un cociente entero sin decimales, o lo que es lo mismo que el resto de cero.
Se debe controlar la entrada de datos.*/

/*¡Hola! Este es un buen ejercicio para aprender a utilizar bucles y condicionales en Java. Para resolver este problema, necesitas leer dos números enteros 
del usuario: el número límite y el número que se utilizará para comprobar si los números son divisibles. Luego, necesitas utilizar un bucle para imprimir 
todos los números enteros positivos menores que el número límite que no sean divisibles por el número que se leyó.

Para controlar la entrada de datos, puedes utilizar un bucle do-while para asegurarte de que los números introducidos son enteros positivos. 
También puedes utilizar una declaración if para comprobar si un número es divisible por el otro.*/

import java.util.Scanner; // Importamos la clase Scanner para poder leer la entrada del usuario

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número entero positivo como límite:"); 
        int limite = scanner.nextInt();

        System.out.println("Introduce otro número entero positivo como divisor:");
        int divisor = scanner.nextInt();

        System.out.println("Los números enteros positivos menores a " + limite + " que no son divisibles entre "
                + divisor + " son:");

        for (int i = 1; i < limite; i++) { // Iniciamos un ciclo for que va desde 1 hasta el número límite ingresado por
                                           // el usuario
            if (i % divisor != 0) { // Si el número actual no es divisible por el número divisor ingresado por el
                                    // usuario
                System.out.println(i); // Mostramos el número actual
            }
        }
    }
}
