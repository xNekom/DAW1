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
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de objetos que lleva en su carro: ");
        int objetos = sc.nextInt();
        System.out.print("Ingrese el tamaño de su carro (pequeño, mediano o grande): ");
        String tamano = sc.next();
        int caja = 0;
        if (objetos < 10) {
            caja = 1;
            if (objetos < 3 && tamano.equals("pequeño")) {
                caja = 2;
            }
        } else if (tamano.equals("mediano")) {
            caja = 10;
            if (objetos > 20) {
                caja = 11;
            }
        } else if (tamano.equals("grande")) {
            caja = 12;
            if (objetos > 30) {
                caja = 14;
            }
        }
        System.out.println("Diríjase a la caja " + caja + ".");
    }
}