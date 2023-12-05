package java_ejercicios;

import java.util.*;



public class prueba {



    public static void main(String[] args) {

        // TODO Auto-generated method stub

        // Desarrolla un programita que dirija a la gente en el supermercado en función

        // de los objetos que llevan en el carro:

        // Hay una cámara que detecta los objetos y dirige a la gente a su caja:

        // A los que llevan menos de 10 objetos el ordenador los manda a las cajas de

        // autopago y una vez allí si llevan menos de 3 a las cajas 1 y 2.

        // A los que llevan el carro mediano con más de 10 objetos van a las cajas 10 y

        // 11 y a los que llevan carro grande a las cajas 12 y 14.

        // En el super hay una sola fila con una pantalla que va mostrando mensajes

        // según van llegando los carros para redirigirlos



        regulaClientes();

        regulaClientes();

        regulaClientes();

        regulaClientes();

        regulaClientes();

        regulaClientes();

    }



    static void regulaClientes() {

        // Desarrolla la función según el enunciado

        boolean carroGrande = true;

        int objetos = (int) (Math.random() * 100);// se genera un entero random entre 0 y 100

        if ((objetos % 2) == 0) { // si es par, es carro será grande(true), si no mediano (carroGrande = false)

            carroGrande = true;

        } else {

            carroGrande = false;

        }
        System.out.println(carroGrande);
        System.out.println(objetos);

        if (objetos < 10) { //si lleva menos de 10 objetos te manda a caja de autopago

            System.out.println("Pasa a caja auto pago");

            if (objetos < 3) { //si el cliente lleva menos de 3 productos te dice que puedes usar las cajas 1 y 2

                System.out.println("Puede usar las cajas 1 y 2");

            }

        }

        else if (objetos > 10) {

            if (carroGrande == false) {

                System.out.println("Cajas 10 y 11");

            } else {

                System.out.println("Cajas 12 y 14");

            }

        }

    }

}

