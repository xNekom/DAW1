package java_ejercicios;

/*Desarrolla un programita que dirija a la gente en el supermercado en función de los objetos que llevan en el carro:
Hay una cámara que detecta los objetos y dirige a la gente a su caja:
A los que llevan menos de 10 objetos el ordenador los manda a las cajas de autopago y una vez allí si llevan menos de 3 a las cajas 1 y 2.
A los que llevan el carro mediano con más de 10 objetos van a las cajas 10 y 11 y a los que llevan carro grande a las cajas 12 y 14.
En el super hay una sola fila con una pantalla que va mostrando mensajes según van llegando los carros para redirigirlos
*/

import java.util.Scanner;

import java.util.Scanner;

public class IF_15 {
    public static void main(String[] args) {
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
        dirigirClientes();
    }

    public static void dirigirClientes() {
        // Declaración de la variable booleana carroGrande y asignación del valor true
        boolean carroGrande;
        carroGrande = true;

        // Generación de un número aleatorio entre 0 y 99 y almacenamiento en la variable objetos
        int objetos = (int) (Math.random() * 100);

        // Si objetos es un número par, carroGrande se establece en true, de lo contrario, se establece en false
        if ((objetos % 2) == 0) {
            carroGrande = true;
        } else {
            carroGrande = false;
        }

        // Evaluación del valor de objetos en una serie de declaraciones condicionales
        if (objetos < 10) {
            System.out.println("Por favor, diríjase a las cajas de autopago.");
            if (objetos < 3) {
                System.out.println("Por favor, diríjase a las cajas 1 y 2.");
            }
        } else if (objetos >= 10) {
            if (carroGrande) {
                System.out.println("Por favor, diríjase a las cajas 12 y 14.");
            } else {
                System.out.println("Por favor, diríjase a las cajas 10 y 11.");
            }
        }
    }
}